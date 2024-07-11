package com.example.spractice.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Doctor", schema = "public")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id", nullable = false)
    private Long id;

    @Column(name = "firstname", nullable = false, length = 100)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "speciality", nullable = false, length = 100)
    private String speciality;

    @Column(name = "room_number", nullable = false)
    private Integer roomNumber;

    @OneToMany(mappedBy = "fkDoctor")
    private Set<Appointment> appointments = new LinkedHashSet<>();

    public Doctor(Long id, String firstname, String lastname, String speciality, Integer roomNumber, Set<Appointment> appointments) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.roomNumber = roomNumber;
        this.appointments = appointments;
    }

    public Doctor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

}