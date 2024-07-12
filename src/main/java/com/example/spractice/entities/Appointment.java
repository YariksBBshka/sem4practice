package com.example.spractice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "appointment", schema = "public")
public class Appointment extends BaseEntity {
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String status;
    private Doctor fkDoctor;
    private Patient fkPatient;
    @Column(name = "appointment_date", nullable = false)
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
    @Column(name = "appointment_time", nullable = false)
    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_doctor_id", nullable = false)
    public Doctor getFkDoctor() {
        return fkDoctor;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_patient_id", nullable = false)
    public Patient getFkPatient() {
        return fkPatient;
    }

    @Column(name = "status", nullable = false, length = 100)
    public String getStatus() {
        return status;
    }

    public Appointment(LocalDate appointmentDate, LocalTime appointmentTime, String status, Doctor fkDoctor, Patient fkPatient) {
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.fkDoctor = fkDoctor;
        this.fkPatient = fkPatient;
    }

    protected Appointment(){
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setFkDoctor(Doctor fkDoctor) {
        this.fkDoctor = fkDoctor;
    }

    public void setFkPatient(Patient fkPatient) {
        this.fkPatient = fkPatient;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    @OneToMany(mappedBy = "fkAppointment")
//    private Set<Diagnosis> diagnoses = new LinkedHashSet<>();
//
//    public Set<Diagnosis> getDiagnoses() {
//        return diagnoses;
//    }
//
//    public void setDiagnoses(Set<Diagnosis> diagnoses) {
//        this.diagnoses = diagnoses;
//    }


}