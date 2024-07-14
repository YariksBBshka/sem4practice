package com.example.spractice.services;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Doctor;

import java.util.Date;
import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    List<Appointment> getAvailableAppointments(Doctor doctor, Date date);

}
