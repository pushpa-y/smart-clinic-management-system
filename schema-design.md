# MySQL Database Schema Design - Smart Clinic Management System

This document outlines the relational database structure for the Clinic Management System. The schema consists of four primary tables to manage doctors, patients, appointments, and medical records.

## 1. Doctors Table
Stores professional details and availability for clinic doctors.
- `id` (INT, Primary Key, Auto Increment)
- `name` (VARCHAR(100))
- `specialty` (VARCHAR(100))
- `email` (VARCHAR(100), Unique)
- `phone_number` (VARCHAR(20))

## 2. Patients Table
Stores personal details and contact information for clinic patients.
- `id` (INT, Primary Key, Auto Increment)
- `name` (VARCHAR(100))
- `email` (VARCHAR(100), Unique)
- `password` (VARCHAR(255))
- `phone_number` (VARCHAR(20))

## 3. Appointments Table
Manages the scheduling of visits between patients and doctors.
- `id` (INT, Primary Key, Auto Increment)
- `appointment_date` (DATETIME)
- `status` (VARCHAR(20)) - e.g., 'SCHEDULED', 'COMPLETED', 'CANCELLED'
- `doctor_id` (INT, Foreign Key referencing Doctors.id)
- `patient_id` (INT, Foreign Key referencing Patients.id)

## 4. Medical_Records Table
Stores historical data regarding patient visits and diagnosis summaries.
- `id` (INT, Primary Key, Auto Increment)
- `visit_date` (DATE)
- `diagnosis` (TEXT)
- `treatment_plan` (TEXT)
- `patient_id` (INT, Foreign Key referencing Patients.id)
- `doctor_id` (INT, Foreign Key referencing Doctors.id)

---

## Relationships (ERD Logic)
1. **One-to-Many (Doctor to Appointments):** One doctor can have multiple scheduled appointments.
2. **One-to-Many (Patient to Appointments):** One patient can book multiple appointments.
3. **One-to-Many (Patient to Medical_Records):** A patient can have multiple historical medical records.
4. **Foreign Keys:** - `appointments.doctor_id` -> `doctors.id`
   - `appointments.patient_id` -> `patients.id`
   - `medical_records.patient_id` -> `patients.id`
