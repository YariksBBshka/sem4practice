package com.example.spractice.repositories;

import com.example.spractice.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByFirstnameAndLastname(String firstname, String lastname);
    List<Doctor> findBySpeciality(String speciality);
}