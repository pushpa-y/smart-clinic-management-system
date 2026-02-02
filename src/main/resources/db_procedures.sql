USE clinic_db;

-- Q21 Procedure
DROP PROCEDURE IF EXISTS GetDailyAppointmentReportByDoctor;
DELIMITER //
CREATE PROCEDURE GetDailyAppointmentReportByDoctor(IN docId INT, IN reportDate DATE)
BEGIN
    SELECT * FROM appointments WHERE doctor_id = docId AND DATE(appointment_date) = reportDate;
END //
DELIMITER ;

-- Q22 Procedure
DROP PROCEDURE IF EXISTS GetDoctorWithMostPatientsByMonth;
DELIMITER //
CREATE PROCEDURE GetDoctorWithMostPatientsByMonth(IN targetMonth INT)
BEGIN
    SELECT doctor_id, COUNT(*) as total FROM appointments 
    WHERE MONTH(appointment_date) = targetMonth
    GROUP BY doctor_id ORDER BY total DESC LIMIT 1;
END //
DELIMITER ;

-- Q23 Procedure
DROP PROCEDURE IF EXISTS GetDoctorWithMostPatientsByYear;
DELIMITER //
CREATE PROCEDURE GetDoctorWithMostPatientsByYear(IN targetYear INT)
BEGIN
    SELECT doctor_id, COUNT(*) as total FROM appointments 
    WHERE YEAR(appointment_date) = targetYear
    GROUP BY doctor_id ORDER BY total DESC LIMIT 1;
END //
DELIMITER ;