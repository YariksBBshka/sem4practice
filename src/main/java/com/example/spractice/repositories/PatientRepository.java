package com.example.spractice.repositories;

import com.example.spractice.entities.Diagnosis;
import com.example.spractice.entities.Doctor;
import com.example.spractice.entities.Patient;
import com.example.spractice.entities.PatientStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByFirstnameAndLastname(String firstname, String lastname);
    List<Patient> findByClientStatus(PatientStatus status);


}