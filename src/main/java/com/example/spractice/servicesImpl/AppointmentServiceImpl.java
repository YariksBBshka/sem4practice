package com.example.spractice.servicesImpl;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.AppointmentStatus;
import com.example.spractice.entities.Doctor;
import com.example.spractice.repositories.AppointmentRepository;
import com.example.spractice.repositories.DoctorRepository;
import com.example.spractice.repositories.PatientRepository;
import com.example.spractice.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
        // implement booking logic
        return true;
    }

    @Override
    public void completeAppointment(Long appointmentId) {
        // implement completion logic
    }

    @Override
    public void cancelAppointment(Long appointmentId) {
        // implement cancellation logic
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


