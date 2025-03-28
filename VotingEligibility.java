import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept age from user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        scanner.close();
    }
}

