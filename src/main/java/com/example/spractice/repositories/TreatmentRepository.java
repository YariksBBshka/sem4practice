package com.example.spractice.repositories;

import com.example.spractice.entities.Diagnosis;
import com.example.spractice.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
    List<Treatment> findByFkDiagnosis(Diagnosis diagnosis);
}