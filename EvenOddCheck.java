import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}
