
CREATE DATABASE IF NOT EXISTS clinic_db;
USE clinic_db;

-- 1. Create Stored Procedure for Daily Reports
DELIMITER //
CREATE PROCEDURE GetDailyAppointmentReport(IN docId INT, IN reportDate DATE)
BEGIN
    SELECT * FROM appointments 
    WHERE doctor_id = docId AND DATE(appointment_date) = reportDate;
END //
DELIMITER ;

-- 2. Sample Data for Evaluation
INSERT INTO patients (name, email, password) VALUES 
('Alice Smith', 'alice@test.com', 'pass123'),
('Bob Jones', 'bob@test.com', 'pass123'),
('Charlie Brown', 'charlie@test.com', 'pass123'),
('Diana Ross', 'diana@test.com', 'pass123'),
('Edward Bloom', 'edward@test.com', 'pass123');