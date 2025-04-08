package guvitask4;

import java.util.Scanner;

//User-defined exception for age validation
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//User-defined exception for name validation
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     // Validate name
     if (!name.matches("[a-zA-Z ]+")) {
         throw new NameNotValidException("Error: Name contains invalid characters!");
     }
     
     // Validate age
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Error: Age must be between 15 and 21!");
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 public void display() {
     System.out.println("Student Roll No: " + rollNo);
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
     System.out.println("Student Course: " + course);
 }
}