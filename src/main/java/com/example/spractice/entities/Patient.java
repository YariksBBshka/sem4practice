package com.example.spractice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "patient", schema = "public")
public class Patient extends BaseEntity{
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String clientStatus;

    @Column(name = "firstname", nullable = false, length = 100)
    public String getFirstname() {
        return firstname;
    }

    @Column(name = "lastname", nullable = false, length = 100)
    public String getLastname() {
        return lastname;
    }

    @Column(name = "date_of_birth", nullable = false)
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Column(name = "address", nullable = false, length = 50)
    public String getAddress() {
        return address;
    }

    @Column(name = "phone_number", nullable = false, length = 50)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Column(name = "client_status", nullable = false, length = 50)
    public String getClientStatus() {
        return clientStatus;
    }

    public Patient(String firstname, String lastname, LocalDate dateOfBirth, String address, String phoneNumber, String clientStatus) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.clientStatus = clientStatus;
    }


    protected Patient(){

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

//    public Set<Appointment> getAppointments() {
//        return appointments;
//    }
//
//    public void setAppointments(Set<Appointment> appointments) {
//        this.appointments = appointments;
//    }
//    @OneToMany(mappedBy = "fkPatient")
//    private Set<Appointment> appointments = new LinkedHashSet<>();

}