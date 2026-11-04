# 🦷 Odontal - Clinic Management System Specification

## 1. Project Overview
**Odontal** is a management system designed to provide control over a dental clinic's operations, specifically focusing on patient management. The system allows clinic staff to register, view, manage, and track patients, including their basic demographic information and clinical medical history.

## 2. Domain Model (Entities)

### 2.1. Patient
The core entity representing the individual receiving dental care.
*   **Id**: Unique identifier for the patient.
*   **Name**: Full name of the patient.
*   **Age**: Current age of the patient.
*   **Obs (Observations)**: General notes, secretary remarks, or basic alerts (e.g., "Allergic to penicillin", "Prefers morning appointments").

### 2.2. Medical History
Clinical records linked to a specific patient, detailing their dental care over time.
*   **Id**: Unique identifier for the record.
*   **Patient Id**: Reference to the associated patient.
*   **Date**: Date of the clinical visit/record.
*   **Description**: Clinical findings, diagnosis, and treatments performed by the dentist.

---

## 3. Functional Requirements (CRUD)

The system must support the following operations for Patient Management:

### 3.1. Create (Register)
*   The system must allow the user to register a new patient.
*   Required inputs: Name, Age, and initial Observations (optional).
*   The system must automatically generate and assign a unique `Id` to the new patient.

### 3.2. Read (List & View)
*   **List All**: The system must display a summary list of all registered patients (showing Id, Name, and Age).
*   **View Details**: The system must allow the user to search for a specific patient by their `Id` and display their full profile, including their `Obs` and their complete `Medical History`.

### 3.3. Update (Edit)
*   The system must allow the user to modify a patient's basic information (Name, Age, Obs).
*   The system must allow the user to append new entries to a patient's `Medical History`.

### 3.4. Delete (Remove)
*   The system must allow the user to permanently remove a patient and all their associated medical history from the system using their `Id`.

---

## 4. User Interface & Flows (Terminal)

The application operates via a text-based terminal menu.

### 4.1. Main Menu
Displayed upon startup and after every completed action.
```text
====================================
       ODONTAL CLINIC SYSTEM
====================================
1. Register New Patient
2. List All Patients
3. View / Manage Patient Details
4. Delete Patient
5. Exit
====================================
Select an option: 