import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (% per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
