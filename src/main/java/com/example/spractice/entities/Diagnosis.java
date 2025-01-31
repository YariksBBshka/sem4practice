package com.example.spractice.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "diagnosis", schema = "public")
public class Diagnosis extends BaseEntity {
    private String disease;
    private String description;
    private Appointment fkAppointment;
    @Column(name = "disease", nullable = false)
    public String getDisease() {
        return disease;
    }

    @Column(name = "description", nullable = false, length = 4095)
    public String getDescription() {
        return description;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_appointment_id", nullable = false)
    public Appointment getFkAppointment() {
        return fkAppointment;
    }

    public Diagnosis(String disease, String description, Appointment fkAppointment) {
        this.disease = disease;
        this.description = description;
        this.fkAppointment = fkAppointment;
    }

    protected Diagnosis(){
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFkAppointment(Appointment fkAppointment) {
        this.fkAppointment = fkAppointment;
    }

//
//    @OneToMany(mappedBy = "fkDiagnosis")
//    private Set<Treatment> treatments = new LinkedHashSet<>();
//
//    public Set<Treatment> getTreatments() {
//        return treatments;
//    }
//
//    public void setTreatments(Set<Treatment> treatments) {
//        this.treatments = treatments;
//    }

}