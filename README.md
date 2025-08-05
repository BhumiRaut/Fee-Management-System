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
##  📁 Project Structure
```plaintext

##  📁 Project Structure
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
```
---
## 📸 Output(Screenshot)
<img width="1863" height="886" alt="screen1outputspring" src="https://github.com/user-attachments/assets/8a3f34ab-4eb7-4e84-a210-5b5cc27e958e" />


<img width="1920" height="1080" alt="Screenshot (3)" src="https://github.com/user-attachments/assets/6b4df991-07d1-4f68-b8f1-87e15b369afc" />


<img width="1920" height="1080" alt="Screenshot (4)" src="https://github.com/user-attachments/assets/ce900d31-3080-4bb3-b833-2dc31b0767f1" />

---
👨‍💻 Developer Information

Name: Bhumi Yuvraj Raut

Email: bhumiraut5555@gmail.com

GitHub: github.com/BhumiRaut








