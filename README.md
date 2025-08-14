# LUCHEMIR: Hospital Record Management System

## 📌 Overview
**LUCHEMIR** is a Hospital Record Management System (HRMS) developed as part of the **IC 217 – Data Structures** course at the *University of Southeastern Philippines, College of Information and Computing*.  

The system aims to:
- Digitize hospital processes
- Improve workflow efficiency
- Ensure accurate and secure patient record-keeping

It addresses common hospital administration challenges such as maintaining patient notes, managing related data (e.g., x-rays, drug prescriptions), and supporting medical research. It also considers practical implementation issues like smooth migration from legacy systems and adaptability to future IT advancements.

**Project Date:** January 2023  
**Developers:**  
- AGLIAM, Bim Rochee P.  

---

## ✨ Features
- **Patient Management** – Add, search, and manage patient details (ID, name, age, gender, address, contact).
- **Medicine Management** – Track inventory (ID, name, selling/buying price, quantity, description).
- **Checkup Management** – Record checkups, fees, recommendations, and prescribed medicines with quantities.
- **Report Generation** – Search and retrieve records by ID.
- **Earnings Tracking** – Calculate income from fees and medicine sales, including net earnings.
- **Vaccine Management** – Manage COVID-19 vaccination details (name, doses, boosters).
- **User Authentication** – Basic login for secure access.
- **Efficient Data Handling** – Uses data structures (arrays, lists) for optimized storage and retrieval.
- **GUI with Java Swing** – Intuitive, user-friendly interface.

---

## 🗂 Class Diagram Overview
Core entities and their responsibilities:

- **Patient** – Stores and manages patient records.
- **Medicine** – Handles inventory data and search functions.
- **Checkup** – Manages checkup sessions, fees, and prescribed medicines.
- **Vaccine** – Tracks vaccination details for each patient.
- **Earnings** – Calculates financial data from operations.
- **Report** – Retrieves and formats records for output.

UI components use **Java Swing** (`JPanel`, `JLabel`, `JTextField`, `JButton`) with event handling (`ActionListener`) to manage interactions.  
A main application controller (`Main` or `Login` class) coordinates overall system flow.

---

## 🎨 User Interface
The application features a **light blue and green** theme for a clean, medical-oriented appearance.

**Screens:**
1. **Login** – Logo, simplified authentication, and navigation to main dashboard.
2. **Main Dashboard** – Icons for Patients, Reports, Medicines, Earnings, Checkups, and Vaccine.
3. **Patients Menu** – Form-based patient data entry and search.
4. **Medicines Menu** – Medicine inventory form with save and search functions.
5. **Checkup Menu** – Inputs for patient ID, recommendations, medicines, and fees.
6. **Reports Menu** – Search and display patient or medicine records.
7. **Earnings Menu** – Displays earnings from fees and medicine sales.
8. **Vaccine Menu** – Vaccine details with save/search options.

---

## ⚙ Installation & Usage
1. Install **Java JDK** (version 8+ recommended).
2. Clone or download this repository.
3. Compile the Java files:
   ```bash
   javac *.java

---

## 📚 References
Typical Problems of a Hospital Management System – Best HMS Software
Hospital Records Management System – Doris A.

## 📝 Disclaimer
This project was created for educational purposes to demonstrate the application of data structures in software development.







