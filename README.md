# Student Management System

## Project Description

The **Student Management System** is a console-based mini project developed using **Core Java**. The application allows users to manage student records through a menu-driven interface.

Users can add, view, search, update, and delete student records. Each student contains details such as Student ID, Name, Age, Course, and Marks. The system also calculates the student's grade based on their marks.

This project is developed without using any database or external frameworks.

---

## Features

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student
* Calculate Student Grade
* Find Topper
* Calculate Average Marks
* Sort Students by Marks
* Search Students by Course
* Validate Duplicate Student IDs
* Exit Application

---

## Technologies Used

* Java
* Core Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* Exception Handling

---

## Concepts Used

This project demonstrates the following Core Java concepts:

### Classes and Objects

Classes and objects are used to represent and manage student information.

### Constructors

Constructors are used to initialize student objects.

### Encapsulation

Student data is kept private and accessed using getter and setter methods.

### Inheritance

Inheritance is used to demonstrate code reusability between related classes.

### Interfaces

Interfaces are used to define common functionalities.

### Method Overriding

Method overriding is used to provide specific implementations of inherited methods.

### ArrayList

ArrayList is used to store student records dynamically.

### Methods

Different methods are created for operations such as adding, searching, updating, and deleting students.

### Loops

Loops are used to display menus and process multiple student records.

### Conditional Statements

Conditional statements are used for validation and decision-making.

### Switch-Case

Switch-case is used to implement the menu-driven application.

### Scanner

Scanner is used to accept user input from the console.

### Exception Handling

Try-catch blocks are used to handle invalid user input and prevent the application from crashing.

---

## Student Details

Each student contains the following information:

| Field      | Description                     |
| ---------- | ------------------------------- |
| Student ID | Unique identification number    |
| Name       | Name of the student             |
| Age        | Age of the student              |
| Course     | Course of the student           |
| Marks      | Marks obtained by the student   |
| Grade      | Grade calculated based on marks |

---

## Grade Calculation

The student's grade is calculated based on marks.

| Marks    | Grade |
| -------- | ----- |
| 90 - 100 | A+    |
| 80 - 89  | A     |
| 70 - 79  | B     |
| 60 - 69  | C     |
| 50 - 59  | D     |
| Below 50 | F     |

---

## Menu Options

The application provides a menu-driven interface similar to the following:

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Find Topper
7. Calculate Average Marks
8. Sort Students by Marks
9. Search Students by Course
10. Exit

Enter your choice:
```

---

## Project Structure

```text
StudentManagementSystem/
│
├── src/
│   ├── Student.java
│   ├── StudentService.java
│   ├── Main.java
│   └── Other Java Files
│
└── README.md
```

---

## How to Run the Project

1. Download or clone the repository.
2. Open the project in any Java IDE.
3. Compile the Java files.
4. Run the `Main.java` file.
5. Use the menu options to manage student records.

---

## Requirements

* Java JDK 8 or above
* Any Java IDE

Examples:

* Eclipse
* IntelliJ IDEA
* NetBeans
* Visual Studio Code

---

## Not Used in This Project

This project does **not** use:

* Database
* MySQL
* JDBC
* Spring Boot
* Hibernate
* External frameworks

All student records are managed using an **ArrayList** while the application is running.

---

## Learning Outcomes

After completing this project, students can understand:

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Inheritance
* Interfaces
* Method Overriding
* Collections using ArrayList
* Exception Handling
* Menu-Driven Applications
* CRUD Operations in Core Java

---

## Author

**Dnyaneshwari Rode**

Diploma in Computer Engineering

---

## Conclusion

The Student Management System is a simple Core Java console application that demonstrates important Java programming concepts and CRUD operations without using databases or frameworks.
