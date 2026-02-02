# User Stories - Smart Care Clinic Management System

## 1. Admin Stories

### Story: Add and Manage Doctor Profiles
**As an** Admin,  
**I want to** add, edit, and delete doctor profiles,  
**So that** the clinic's staff directory is always up to date.
* **Acceptance Criteria:** * System allows input of name, specialty, email, and available times.
    * Doctor email must be unique in the database.
* **Priority:** High
* **Story Points:** 5

### Story: System Audit Logs
**As an** Admin,  
**I want to** view a log of all appointment cancellations,  
**So that** I can monitor clinic activity and potential revenue loss.
* **Acceptance Criteria:** * Admin can see date, doctor name, and reason for cancellation.
* **Priority:** Low
* **Story Points:** 3

---

## 2. Patient Stories

### Story: Search Doctors by Specialty
**As an** Patient,  
**I want to** search for doctors based on their specialty and availability,  
**So that** I can find the right care for my specific medical needs.
* **Acceptance Criteria:** * Filter results by specialty (e.g., Cardiologist).
    * Filter results by time slots (e.g., 09:00-10:00).
* **Priority:** High
* **Story Points:** 5

### Story: View Medical History
**As an** Patient,  
**I want to** access my past medical records and prescriptions,  
**So that** I can track my health progress over time.
* **Acceptance Criteria:** * User must be logged in to view records.
    * Records must show date, diagnosis, and treatment plan.
* **Priority:** Medium
* **Story Points:** 8

---

## 3. Doctor Stories

### Story: Manage Daily Schedule
**As an** Doctor,  
**I want to** view my daily list of scheduled appointments,  
**So that** I can prepare for my patients efficiently.
* **Acceptance Criteria:** * Display patient names and appointment times in chronological order.
* **Priority:** High
* **Story Points:** 3

### Story: Issue Digital Prescriptions
**As an** Doctor,  
**I want to** create and save digital prescriptions for patients after a visit,  
**So that** patients can access their medication details online.
* **Acceptance Criteria:** * Prescription must include medication name, dosage, and duration.
    * The record must be linked to the Patient ID.
* **Priority:** High
* **Story Points:** 5
