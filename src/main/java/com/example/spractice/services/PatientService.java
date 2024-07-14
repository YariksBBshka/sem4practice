package com.example.spractice.services;

import com.example.spractice.entities.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();
    Patient getPatientById(Long id);


}
