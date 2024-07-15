package com.example.spractice.dto;

import java.time.LocalDate;

public class PatientDto {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final LocalDate dateOfBirth;
    private final String clientStatus;

    public PatientDto(Long id, String firstname, String lastname, LocalDate dateOfBirth, String clientStatus) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.clientStatus = clientStatus;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getClientStatus() {
        return clientStatus;
    }
}