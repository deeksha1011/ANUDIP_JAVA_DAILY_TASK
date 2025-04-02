import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Store original number for comparison
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Get last digit
            reversedNumber = (reversedNumber * 10) + digit; // Build reversed number
            number = number / 10; // Remove last digit
        }

        // Check if the original and reversed numbers are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome Number.");
        }
    }
}
