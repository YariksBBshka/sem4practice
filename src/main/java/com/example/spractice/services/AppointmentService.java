package com.example.spractice.services;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.Doctor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AppointmentService {
    boolean bookAppointment(Appointment appointment);
    void completeAppointment(Long appointmentId);
    void cancelAppointment(Long appointmentId);
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    void createAppointment(Appointment appointment);
    void updateAppointment(Appointment appointment);
    void deleteAppointment(Long id);
}
