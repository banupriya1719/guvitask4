package guvitask4;
// Custom Unchecked Exception for Invalid Age
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Voter Class
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized Constructor
    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Method to Display Voter Details
    public void display() {
        System.out.println("\nVoter Registered Successfully!");
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}