package com.smartcare.clinic_management.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartcare.clinic_management.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // This supports Question 6: Find appointments for a doctor on a specific date
    List<Appointment> findByDoctorIdAndAppointmentDate(Long doctorId, LocalDateTime date);
}