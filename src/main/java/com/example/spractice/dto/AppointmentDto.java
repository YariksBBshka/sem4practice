package com.example.spractice.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentDto{
    private final Long id;
    private final LocalDate appointmentDate;
    private final LocalTime appointmentTime;
    private final DoctorDto fkDoctor;
    private final PatientDto fkPatient;
    private final String status;

    public AppointmentDto(Long id, LocalDate appointmentDate, LocalTime appointmentTime, DoctorDto fkDoctor, PatientDto fkPatient, String status) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.fkDoctor = fkDoctor;
        this.fkPatient = fkPatient;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public DoctorDto getFkDoctor() {
        return fkDoctor;
    }

    public PatientDto getFkPatient() {
        return fkPatient;
    }

    public String getStatus() {
        return status;
    }
}