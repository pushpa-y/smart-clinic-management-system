package com.smartcare.clinic_management.controller;

import com.smartcare.clinic_management.model.Prescription;
import com.smartcare.clinic_management.service.PrescriptionService;
import com.smartcare.clinic_management.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @Autowired
    private TokenService tokenService;

    // Requirement: Token as @PathVariable and @Valid for body validation
    @PostMapping("/{token}")
    public ResponseEntity<Map<String, String>> savePrescription(
            @PathVariable String token,
            @Valid @RequestBody Prescription prescription) {

        Map<String, String> response = new HashMap<>();

        // Requirement: Token Validation logic
        if (!tokenService.validateToken(token)) {
            response.put("error", "Unauthorized: Invalid Token");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }

        prescriptionService.save(prescription);
        
        // Requirement: Using ResponseEntity for structured response
        response.put("message", "Prescription saved successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
