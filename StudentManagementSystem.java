package guvitask4;

import java.util.Scanner;
//main class
public class StudentManagementSystem {
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);   //getting input using scanner
 // using try catch and finally key to catch an exceptions 
	     try {
	         System.out.print("Enter Roll No: ");
	         int rollNo = scanner.nextInt();
	         scanner.nextLine();               
	         System.out.print("Enter Name: ");
	         String name = scanner.nextLine();

	         System.out.print("Enter Age: ");
	         int age = scanner.nextInt();
	         scanner.nextLine();                       //GO TO THE NEXT LINE 

	         System.out.print("Enter Course: ");
	         String course = scanner.nextLine();

	         Student student = new Student(rollNo, name, age, course);
	         System.out.println("\nStudent details successfully saved!");
	         student.display();
	     } 
	     
	     catch (AgeNotWithinRangeException | NameNotValidException e) {
	         System.out.println(e.getMessage());
	     } 
	     catch (Exception e) {
	         System.out.println("Unexpected error: " + e.getMessage());
	     } 
	     //block of code
	     finally {
	         scanner.close();
	     }
	 }
}
