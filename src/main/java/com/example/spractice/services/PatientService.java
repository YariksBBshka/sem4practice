package com.example.spractice.services;

import com.example.spractice.entities.Diagnosis;
import com.example.spractice.entities.Patient;

import java.util.List;

public interface PatientService {

    Patient getPatientByFirstnameAndLastname(String firstname, String lastname);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    void createPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(Long id);
    List<Diagnosis> getDiagnosisHistory(Long patientId);


}
