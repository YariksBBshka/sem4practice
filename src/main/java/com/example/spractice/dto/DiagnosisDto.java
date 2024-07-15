package com.example.spractice.dto;

public class DiagnosisDto {
    private final Long id;
    private final String disease;
    private final String description;
    private final AppointmentDto fkAppointment;

    public DiagnosisDto(Long id, String disease, String description, AppointmentDto fkAppointment) {
        this.id = id;
        this.disease = disease;
        this.description = description;
        this.fkAppointment = fkAppointment;
    }

    public Long getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public String getDescription() {
        return description;
    }

    public AppointmentDto getFkAppointment() {
        return fkAppointment;
    }
}