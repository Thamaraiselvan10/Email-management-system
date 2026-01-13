# 📧 Mail Management System (Java)

A console-based Java application that simulates a basic email system with user registration, login, mail composition, Inbox and Sent folder management, and read/unread status tracking.

This project focuses on object-oriented programming, in-memory data handling, and real-world mail workflow simulation.

---

## 📌 Problem Overview

The system allows multiple users to:

- Register with unique Email ID  
- Login with credentials  
- Send and receive mails  
- Manage Inbox and Sent folders  
- Track Read / Unread mail status  

Detailed problem specification:
docs/problem-statement.md

---

## ✨ Features

- User Registration and Login  
- Duplicate Email ID prevention  
- Compose and Send Mail  
- Inbox with Read / Unread tracking  
- Sent folder management  
- Session handling for logged-in users  
- In-memory data storage (No database)  

---

## 🧠 Functional Workflow

1. User signs up with Email ID and Password  
2. User logs in with valid credentials  
3. Logged-in user can:
   - Compose and send mails  
   - View Inbox  
   - Read mails (marks as Read)  
   - View Sent mails  
4. Each user has independent Inbox and Sent folders  
5. Reading a mail does not affect the sender’s Sent folder  

---

## 🖥️ Sample Execution

Complete console input and output:
docs/sample-output.md

---

## 🛠️ How to Run

Prerequisites:
- Java JDK 8 or above  
- Command Prompt / Terminal  

Steps:
javac MailManagementSystem.java  
java MailManagementSystem  

---

## 📂 Project Structure

mail-management-system/
│
├── src/
│   └── MailManagementSystem.java
├── docs/
│   ├── problem-statement.md
│   └── sample-output.md
├── README.md
└── .gitignore

---

## 🎯 Learning Outcomes

- Object-Oriented Programming principles  
- User authentication implementation  
- Queue/List based Inbox management  
- Read / Unread state handling  
- Data consistency across users  

---

## 👨‍💻 Author

Thamarai Selvan  
Computer Science Engineering Student  
Java | Data Structures | Problem Solving  

---

## 📌 Notes

- Console-based application  
- No external database used  
- Data stored in memory during runtime  
- Designed for academic learning  
