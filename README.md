# OOP-Semester-Project

## Overview

The **UniversityExaminationProcessing** is a Java console application designed to collect and process examination data for 20 students across 5 different subjects. It captures student details, scores for each subject, computes average scores, assigns grades, and generates a formatted report card with performance recommendations.

---

## Features

- Input student names and IDs.
- Record scores for five specific subjects:
  - OOP
  - Calculus I
  - Database Systems
  - Web Application Development
  - Data Structures and Algorithms
- Compute each student's average score.
- Assign grades based on the average:
  - **A** (70–100): Excellent
  - **B** (60–69): Good
  - **C** (50–59): Satisfactory
  - **D** (40–49): Pass 
  - **F** (0–39): Fail
- Display a report card with scores, average, grade, recommendation, and date.

---

## How It Works

### 1. Student Details Input
readScores(input);
- Prompts the user to enter scores for each student across the 5 defined subjects.

### 2.Average and Grade Calculation
calculateAveragesAndGrades();
- Calculates each student’s average score and assigns a grade and recommendation based on a predefined grading scale.

### 3.Report Card Display
displayReportCards();
- Prints a detailed report for each student, including the date of the report generation using LocalDate.now()

### 4.Running the Program
- Make sure Java is installed on your machine.
- Save the code in a file named UniversityExaminationProcessing.java.
- Open a terminal and navigate to the file directory.
- Compile the program:
javac UniversityExaminationProcessing.java
- Run the program:
java UniversityExaminationProcessing

### 5.Editors
-128220 - Kulundu Bill Enos
-161551 - John Gitu

