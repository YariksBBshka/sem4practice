package com.example.spractice.servicesImpl;

import com.example.spractice.entities.Diagnosis;
import com.example.spractice.entities.Patient;
import com.example.spractice.repositories.DiagnosisRepository;
import com.example.spractice.repositories.PatientRepository;
import com.example.spractice.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @Override
    public Patient getPatientByFirstnameAndLastname(String firstname, String lastname) {
        return patientRepository.findByFirstnameAndLastname(firstname, lastname);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow();
    }

    @Override
    public void createPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public List<Diagnosis> getDiagnosisHistory(Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        return diagnosisRepository.findDiagnosisHistoryByPatientId(patientId);
    }
}


