# 📧 Mail Management System

## Problem Statement

Design and implement a console-based, object-oriented Mail Management System that allows users to register, login, send mails, and manage Inbox and Sent folders.

The system must support user authentication, mail sending, and read/unread status tracking, without using an external database.

---

## I. User Account Management

The system must allow users to:

1. Register (Sign Up) with a unique Email ID and password  
2. Login using valid credentials  
3. Prevent duplicate Email ID registrations  
4. Maintain a session for the logged-in user to perform mail operations  

---

## II. Mail Sending and Receiving

For every email communication:

1. A logged-in user must be able to compose and send mail by providing:
   - Recipient Email ID  
   - Subject  
   - Message Content  

2. The system must:
   - Verify that the recipient exists  
   - Deliver the mail to the recipient’s Inbox  
   - Store a copy in the sender’s Sent folder  

3. The Inbox must display:
   - Sender Email ID  
   - Subject  
   - Date and Time  
   - Read / Unread status  

---

## III. Mail Status Management

### Read / Unread Rules

1. Every received email must be marked as Unread by default  
2. When a user opens an email, its status must change to Read  

### Inbox Display Rules

Inbox must display:
- Sender Email ID  
- Subject  
- Read / Unread status  

### Sent Mail Integrity

- Reading an email in the receiver’s Inbox must NOT affect the sender’s Sent folder  

---

## IV. Data Consistency Rules

- Each user must maintain separate folders:
  - Inbox  
  - Sent  

- Actions performed by one user (such as reading an email) must NOT impact:
  - Another user’s Inbox  
  - Another user’s Sent folder  

- All mail records must be maintained only in memory, without using an external database  

---

## Objective

This project aims to demonstrate:

- Object-Oriented Programming design  
- User authentication handling  
- Inbox and Sent folder management  
- Read / Unread mail tracking  
- In-memory data storage  
