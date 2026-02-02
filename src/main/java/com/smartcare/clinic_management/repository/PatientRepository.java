package com.smartcare.clinic_management.repository;

import com.smartcare.clinic_management.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Requirement: Retrieve a patient using their email address
    Optional<Patient> findByEmail(String email);

    // Requirement: Lookup based on either an email address or a phone number
    Optional<Patient> findByEmailOrPhoneNumber(String email, String phoneNumber);
    
    // Optional: Useful for checking if a patient exists during registration
    Boolean existsByEmail(String email);
}
