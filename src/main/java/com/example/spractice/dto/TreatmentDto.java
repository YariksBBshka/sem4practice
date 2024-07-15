package com.example.spractice.dto;

import java.io.Serializable;

public class TreatmentDto {
    private final Long id;
    private final String medication;
    private final String instructions;
    private final DiagnosisDto fkDiagnosis;

    public TreatmentDto(Long id, String medication, String instructions, DiagnosisDto fkDiagnosis) {
        this.id = id;
        this.medication = medication;
        this.instructions = instructions;
        this.fkDiagnosis = fkDiagnosis;
    }

    public Long getId() {
        return id;
    }

    public String getMedication() {
        return medication;
    }

    public String getInstructions() {
        return instructions;
    }

    public DiagnosisDto getFkDiagnosis() {
        return fkDiagnosis;
    }
}