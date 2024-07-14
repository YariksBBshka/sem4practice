package com.example.spractice.servicesImpl;

import com.example.spractice.entities.*;
import com.example.spractice.repositories.AppointmentRepository;
import com.example.spractice.repositories.DoctorRepository;
import com.example.spractice.repositories.PatientRepository;
import com.example.spractice.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public boolean bookAppointment(Appointment appointment) {
        Doctor doctor = doctorRepository.findByFirstnameAndLastname(appointment.getFkDoctor().getFirstname(), appointment.getFkDoctor().getLastname());
        if (doctor == null) {
            throw new RuntimeException("Doctor not found");
        }
        Patient patient = patientRepository.findByFirstnameAndLastname(appointment.getFkPatient().getFirstname(), appointment.getFkPatient().getLastname());
        if (patient == null) {
            throw new RuntimeException("Patient not found");
        }

        if (isTimeAvailable(doctor, appointment.getAppointmentDate(), appointment.getAppointmentTime(), patient.getClientStatus())) {
            appointment.setStatus(String.valueOf(AppointmentStatus.BOOKED));
            appointmentRepository.save(appointment);
            return true;
        } else {
            // send message that time is not available
            return false;
        }
    }

    @Override
    public void completeAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        appointment.setStatus(String.valueOf(AppointmentStatus.COMPLETED));
        appointmentRepository.save(appointment);
    }

    @Override
    public void cancelAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        appointment.setStatus(String.valueOf(AppointmentStatus.CANCELLED));
        appointmentRepository.save(appointment);
    }

    private boolean isTimeAvailable(Doctor doctor, LocalDate date, LocalTime time, String patientStatus) {
        // check if time is within working hours
        if (time.isBefore(LocalTime.of(10, 0)) || time.isAfter(LocalTime.of(18, 0))) {
            if (patientStatus.equals(PatientStatus.VIP.name())) {
                // VIP patients can book from 10 to 19
                if (time.isAfter(LocalTime.of(19, 0))) {
                    return false;
                }
            } else {
                return false;
            }
        }

        // check if time is already booked for the doctor on the given date
        List<Appointment> appointments = appointmentRepository.findByDoctorAndDate(doctor, date);
        for (Appointment existingAppointment : appointments) {
            if (existingAppointment.getAppointmentTime().equals(time)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElseThrow();
    }

    @Override
    public void createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}


