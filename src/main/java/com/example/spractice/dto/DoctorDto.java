package com.example.spractice.dto;

public class DoctorDto{
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String speciality;
    private final Integer roomNumber;

    public DoctorDto(Long id, String firstname, String lastname, String speciality, Integer roomNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.roomNumber = roomNumber;
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

    public String getSpeciality() {
        return speciality;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
}