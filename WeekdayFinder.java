package guvitask4;
import java.util.Scanner;

	public class WeekdayFinder {
		
	    public static void main(String[] args) {
	        // Array storing weekdays (Sunday at index 0)
	        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            // Taking user input
	            System.out.print("Enter a day position (0-6): ");
	            int index = scanner.nextInt();
	            
	            // Printing the corresponding weekday
	            System.out.println("Day: " + weekdays[index]);
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handling invalid index input
	            System.out.println("Error: Please enter a valid index between 0 and 6.");
	        } finally {
	            scanner.close(); // Close scanner
	        }
	    }
	}