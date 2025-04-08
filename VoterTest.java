package guvitask4;
import java.util.Scanner;
// Main Class to Test the Program
public class VoterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Creating a voter object
            Voter voter = new Voter(voterId, name, age);
            voter.display();

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
