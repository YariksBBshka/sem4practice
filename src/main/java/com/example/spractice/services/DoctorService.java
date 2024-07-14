package com.example.spractice.services;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Doctor;

import java.util.Date;
import java.util.List;

public interface DoctorService {
    Doctor getDoctorByFirstnameAndLastname(String firstname, String lastname);
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    void createDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(Long id);
    List<Doctor> getDoctorsBySpeciality(String speciality);

}
