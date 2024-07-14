package com.example.spractice.repositories;

import com.example.spractice.entities.Doctor;
import com.example.spractice.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findAllByLastname (String lastname);
}