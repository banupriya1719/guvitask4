package guvitask4;
import java.util.HashMap;
import java.util.Scanner;

	public class StudentGradeManager {
	    private HashMap<String, Integer> studentGrades;

	    public StudentGradeManager() {
	        studentGrades = new HashMap<>();
	    }

	    // Method to add a new student
	    public void addStudent(String name, int grade) {
	        studentGrades.put(name, grade);
	        System.out.println(name + " has been added with grade: " + grade);
	    }

	    // Method to remove a student
	    public void removeStudent(String name) {
	        if (studentGrades.containsKey(name)) {
	            studentGrades.remove(name);
	            System.out.println(name + " has been removed.");
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    // Method to display a student's grade by name
	    public void displayGrade(String name) {
	        if (studentGrades.containsKey(name)) {
	            System.out.println(name + "'s Grade: " + studentGrades.get(name));
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    public static void main(String[] args) {
	        StudentGradeManager manager = new StudentGradeManager();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display Grade");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student grade: ");
	                    int grade = scanner.nextInt();
	                    manager.addStudent(name, grade);
	                    break;
	                case 2:
	                    System.out.print("Enter student name to remove: ");
	                    String removeName = scanner.nextLine();
	                    manager.removeStudent(removeName);
	                    break;
	                case 3:
	                    System.out.print("Enter student name to display grade: ");
	                    String displayName = scanner.nextLine();
	                    manager.displayGrade(displayName);
	                    break;
	                case 4:
	                    System.out.println("Exiting program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}