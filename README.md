# 👨‍🎓 Diploma Student Fee Management System

A full-stack web application for managing student fee records across first, second, and third years of diploma education. Built with **Spring Boot**, **PostgreSQL**, and a clean, responsive **HTML/CSS/JS** frontend.

## 📌 Features

- 🎯 Add, update, delete and view student fee records.
- 🧑‍🎓 Separate sections for **First Year**, **Second Year**, and **Third Year** students.
- 💵 Tracks **Total Fee**, **Paid Fee**, and **Pending Fee** for each student.
- 📂 Two PostgreSQL tables:
  - `student` table (Primary Key: `id`)
  - `fee_record` table (Foreign Key referencing `student.id`)
- 📊 Dashboard view showing fee structure, student details, and payment history.

---

## 💻 Technologies Used

### Backend
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven

### Frontend
- HTML5
- CSS3 (custom design)
- JavaScript (Fetch API for backend communication)

---

## 🧾 Database Setup (PostgreSQL)

1. Create the database:
   ```sql
   CREATE DATABASE fee_db;
 
---

## 📁 Project Structure
FeeManagementSystem/
├── backend/
│ └── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── feesystem/
│ │ └── FeeManager/
│ │ ├── FeeManagerApplication.java
│ │ ├── Student.java
│ │ ├── FeeRecord.java
│ │ ├── StudentRepository.java
│ │ ├── FeeRecordRepository.java
│ │ └── FeeController.java
│ └── resources/
│ ├── application.properties
│
├── frontend/
│ ├── index.html
│ ├── style.css
│ └── script.js
│
├── pom.xml
└── README.md


