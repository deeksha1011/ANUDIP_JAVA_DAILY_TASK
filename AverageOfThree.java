import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculating the average
        double average = (num1 + num2 + num3) / 3;

        // Displaying the result
        System.out.println("Average of the three numbers: " + average);

        scanner.close();
    }
}
