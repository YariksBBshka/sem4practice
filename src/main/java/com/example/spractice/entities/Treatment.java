package com.example.spractice.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Treatment", schema = "public")
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "treatment_id", nullable = false)
    private Long id;

    @Column(name = "medication", nullable = false, length = 4095)
    private String medication;

    @Column(name = "instructions", nullable = false, length = 4095)
    private String instructions;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "fk_diagnosis_id", nullable = false)
    private Diagnosis fkDiagnosis;

    public Treatment(Long id, String medication, String instructions, Diagnosis fkDiagnosis) {
        this.id = id;
        this.medication = medication;
        this.instructions = instructions;
        this.fkDiagnosis = fkDiagnosis;
    }

    public Treatment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Diagnosis getFkDiagnosis() {
        return fkDiagnosis;
    }

    public void setFkDiagnosis(Diagnosis fkDiagnosis) {
        this.fkDiagnosis = fkDiagnosis;
    }

}