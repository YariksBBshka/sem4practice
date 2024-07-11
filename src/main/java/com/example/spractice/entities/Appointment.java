package com.example.spractice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Appointment", schema = "public")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", nullable = false)
    private Long id;

    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;

    @Column(name = "appointment_time", nullable = false)
    private LocalTime appointmentTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_doctor_id", nullable = false)
    private Doctor fkDoctor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_patient_id", nullable = false)
    private Patient fkPatient;

    @Column(name = "status", nullable = false, length = 100)
    private String status;

    @OneToMany(mappedBy = "fkAppointment")
    private Set<Diagnosis> diagnoses = new LinkedHashSet<>();

    public Appointment(Long id, LocalDate appointmentDate, LocalTime appointmentTime, Doctor fkDoctor, Patient fkPatient, String status, Set<Diagnosis> diagnoses) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.fkDoctor = fkDoctor;
        this.fkPatient = fkPatient;
        this.status = status;
        this.diagnoses = diagnoses;
    }

    public Appointment(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Doctor getFkDoctor() {
        return fkDoctor;
    }

    public void setFkDoctor(Doctor fkDoctor) {
        this.fkDoctor = fkDoctor;
    }

    public Patient getFkPatient() {
        return fkPatient;
    }

    public void setFkPatient(Patient fkPatient) {
        this.fkPatient = fkPatient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Diagnosis> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

}