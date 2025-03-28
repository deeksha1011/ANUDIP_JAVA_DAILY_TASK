import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Check the greatest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }

        // Close the scanner
        scanner.close();
    }
}
