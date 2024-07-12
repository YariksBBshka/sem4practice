package com.example.spractice.repositories;

import com.example.spractice.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}