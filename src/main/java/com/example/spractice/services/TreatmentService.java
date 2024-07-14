package com.example.spractice.services;

import com.example.spractice.entities.Treatment;

import java.util.List;

public interface TreatmentService {
    List<Treatment> getTreatmentsByDiagnosis(Long diagnosisId);
    Treatment getTreatmentById(Long id);
    void createTreatment(Treatment treatment);
    void updateTreatment(Treatment treatment);
    void deleteTreatment(Long id);
}
