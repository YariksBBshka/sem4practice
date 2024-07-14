package com.example.spractice.repositories;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
    List<Diagnosis> findByFkAppointment(Appointment appointment);
    @Query("SELECT d FROM Diagnosis d JOIN d.fkAppointment a JOIN a.fkPatient p WHERE p.id = :patientId")
    List<Diagnosis> findDiagnosisHistoryByPatientId(@Param("patientId") Long patientId);
}