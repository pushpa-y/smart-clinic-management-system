package com.smartcare.clinic_management.service;

import com.smartcare.clinic_management.model.Appointment;
import com.smartcare.clinic_management.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    // Criteria: Booking method that saves an appointment
    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Criteria: Retrieve appointments for a doctor on a specific date
    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDateTime date) {
        return appointmentRepository.findByDoctorIdAndAppointmentDate(doctorId, date);
    }
}