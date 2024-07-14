package com.example.spractice.servicesImpl;

import com.example.spractice.entities.Appointment;
import com.example.spractice.entities.AppointmentStatus;
import com.example.spractice.entities.Doctor;
import com.example.spractice.repositories.AppointmentRepository;
import com.example.spractice.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    public List<Appointment> getAppointments(Doctor doctor, LocalDate date) {
        return null;
    }

    @Override
    public void bookAppointment(Appointment appointment) {

    }

    @Override
    public void cancelAppointment(Appointment appointment) {

    }

    @Override
    public void completeAppointment(Appointment appointment) {

    }
}

