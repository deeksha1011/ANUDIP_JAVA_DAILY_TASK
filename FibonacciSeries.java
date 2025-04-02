import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1;

        // Print Fibonacci series
        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
