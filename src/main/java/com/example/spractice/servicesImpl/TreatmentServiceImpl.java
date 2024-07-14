package com.example.spractice.servicesImpl;

import com.example.spractice.entities.Diagnosis;
import com.example.spractice.entities.Treatment;
import com.example.spractice.repositories.DiagnosisRepository;
import com.example.spractice.repositories.TreatmentRepository;
import com.example.spractice.services.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;
    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @Override
    public List<Treatment> getTreatmentsByDiagnosis(Long diagnosisId) {
        Diagnosis diagnosis = diagnosisRepository.findById(diagnosisId).orElseThrow();
        return treatmentRepository.findByFkDiagnosis(diagnosis);
    }

    @Override
    public Treatment getTreatmentById(Long id) {
        return treatmentRepository.findById(id).orElseThrow();
    }

    @Override
    public void createTreatment(Treatment treatment) {
        treatmentRepository.save(treatment);
    }

    @Override
    public void updateTreatment(Treatment treatment) {
        treatmentRepository.save(treatment);
    }

    @Override
    public void deleteTreatment(Long id) {
        treatmentRepository.deleteById(id);
    }
}
