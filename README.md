# InterNova-Week-5-
InternNova Java Development Assignment covering Packages, Interfaces, Abstract Classes, File Handling, and Multithreading.



# InternNova Java Development Assignment

This repository contains my Java assignment completed as part of the InternNova Java Development program.

## Objective

The objective of this assignment is to understand and implement advanced Java concepts through simple practical programs.

## Tasks

### Task 1: Packages – Organizing Java Code

Created a custom package named `studentmanagement` containing a `Student` class with Student ID, Student Name, and Course. The class is imported into another Java class using the `import` keyword.

**Concepts Used:**
- Packages
- `package` keyword
- `import` keyword
- Classes and Objects

---

### Task 2: Interface – Payment System

Created a `Payment` interface with `pay()` and `showPaymentDetails()` methods. The `UPIPayment` and `CardPayment` classes implement the interface with their own method implementations.

**Concepts Used:**
- Interface
- `implements` keyword
- Method implementation
- Polymorphism

---

### Task 3: Abstract Classes – Shape Calculator

Created an abstract class named `Shape` with an abstract `calculateArea()` method and a normal `displayMessage()` method. The `Circle` and `Rectangle` classes extend the `Shape` class and calculate their respective areas.

**Concepts Used:**
- Abstract class
- `abstract` keyword
- Abstract method
- `extends` keyword
- Inheritance
- Method overriding

---

### Task 4: File Handling – Student Records

Created a Java program to write student information into a text file and read the information back from the file. Exception handling is used for file operations.

**Student Details:**
- Student ID
- Student Name
- Course
- Marks

**Concepts Used:**
- File creation
- File writing
- File reading
- `FileWriter`
- `FileReader`
- `BufferedReader`
- Exception handling

---

### Task 5: Multithreading Basics

Created two threads using the Java `Thread` class. One thread prints numbers from 1 to 10, while the second thread prints the message "Learning Java Multithreading" multiple times.

**Concepts Used:**
- Thread
- `run()` method
- `start()` method
- `Thread.sleep()`
- Concurrent execution

## Project Structure

```text
InternNova-Java-Advanced-Concepts
│
├── Task-1-Packages
├── Task-2-Interface
├── Task-3-Abstract-Class
├── Task-4-File-Handling
├── Task-5-Multithreading
└── README.md
