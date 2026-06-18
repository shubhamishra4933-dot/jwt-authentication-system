🔐 JWT Authentication System
Java Spring Boot Spring Security JWT PostgreSQL Maven
📋 Overview
JWT Authentication System is a Spring Boot application that demonstrates secure authentication and authorization using Spring Security, JWT (JSON Web Token), and PostgreSQL.
This project follows a layered architecture with Controller, Service, Repository, Entity, DTO, and Security components.
________________________________________
🛠️ Tech Stack
Backend
•	Java 17
•	Spring Boot
•	Spring Security
•	Spring Data JPA
•	Hibernate
Security
•	JWT Authentication
•	Role-Based Authorization
•	BCrypt Password Encryption
Database
•	PostgreSQL
Tools
•	Maven
•	Git
•	GitHub
•	Postman
________________________________________
📂 Project Structure
jwt-authentication-system

├── README.md
├── pom.xml
├── docs
├── screenshots
├── postman-collection
│
└── src
    └── main
        ├── java
        │   └── com.shubham.jwtauth
        │       ├── controller
        │       ├── service
        │       ├── repository
        │       ├── entity
        │       ├── dto
        │       ├── security
        │       └── JwtAuthApplication.java
        │
        └── resources
            └── application.yml
________________________________________
🔐 Authentication APIs
Register User
POST /auth/register
Sample Request:
{
  "username": "admin",
  "email": "admin@gmail.com",
  "password": "admin123",
  "role": "ADMIN"
}
________________________________________
Login User
POST /auth/login
Sample Request:
{
  "username": "admin",
  "password": "admin123"
}
Sample Response:
{
  "token": "jwt-token-for-admin"
}
________________________________________
💾 Database Schema
Users Table
Column	Type
id	BIGINT
username	VARCHAR(100)
email	VARCHAR(150)
password	VARCHAR(255)
role	VARCHAR(50)
________________________________________
✨ Features
•	User Registration
•	User Login
•	JWT Token Generation
•	Spring Security Integration
•	RESTful APIs
•	Layered Architecture
•	PostgreSQL Integration
•	Repository Pattern
•	DTO Pattern
________________________________________
📸 Screenshots
Future screenshots:
•	Login API Testing
•	Register API Testing
•	PostgreSQL Database Tables
•	JWT Token Generation
________________________________________
🚀 Future Enhancements
•	Real JWT Implementation (jjwt)
•	Refresh Token Support
•	Swagger Documentation
•	Docker Deployment
•	Role-Based Access Control
________________________________________
👨‍💻 Author
Shubham Mishra
LinkedIn: https://www.linkedin.com/in/shubham-mishra-97b19725a/
GitHub: https://github.com/shubhamishra4933-dot
