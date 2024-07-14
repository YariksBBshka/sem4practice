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

    @Override
    public Doctor getDoctorByFirstnameAndLastname(String firstname, String lastname) {
        return doctorRepository.findByFirstnameAndLastname(firstname, lastname);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElseThrow();
    }

    @Override
    public void createDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public List<Doctor> getDoctorsBySpeciality(String speciality) {
        return doctorRepository.findBySpeciality(speciality);
    }

}



