package com.example.spractice.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Diagnosis", schema = "public")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosis_id", nullable = false)
    private Long id;

    @Column(name = "disease", nullable = false)
    private String disease;

    @Column(name = "description", nullable = false, length = 4095)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_appointment_id", nullable = false)
    private Appointment fkAppointment;

    @OneToMany(mappedBy = "fkDiagnosis")
    private Set<Treatment> treatments = new LinkedHashSet<>();

    public Diagnosis(Long id, String disease, String description, Appointment fkAppointment, Set<Treatment> treatments) {
        this.id = id;
        this.disease = disease;
        this.description = description;
        this.fkAppointment = fkAppointment;
        this.treatments = treatments;
    }

    public Diagnosis(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment getFkAppointment() {
        return fkAppointment;
    }

    public void setFkAppointment(Appointment fkAppointment) {
        this.fkAppointment = fkAppointment;
    }

    public Set<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(Set<Treatment> treatments) {
        this.treatments = treatments;
    }

}