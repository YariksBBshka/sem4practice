package com.example.spractice.services;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Doctor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);

    List<Appointment> getAppointments(Doctor doctor, LocalDate date);

    void bookAppointment(Appointment appointment);
    void cancelAppointment(Appointment appointment);
    void completeAppointment(Appointment appointment);

}
