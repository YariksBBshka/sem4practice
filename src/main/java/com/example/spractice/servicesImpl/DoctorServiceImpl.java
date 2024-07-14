package com.example.spractice.servicesImpl;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Doctor;
import com.example.spractice.repositories.AppointmentRepository;
import com.example.spractice.repositories.DoctorRepository;
import com.example.spractice.repositories.PatientRepository;
import com.example.spractice.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DoctorServiceImpl  implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return null;
    }

    @Override
    public List<Appointment> getAvailableAppointments(Doctor doctor, Date date) {
        return null;
    }
}



