import java.util.Scanner;

public class ATMPinVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int correctPIN = 1234; // Correct PIN
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN == correctPIN) {
                System.out.println("PIN correct. Access granted.");
                break; // Exit loop if the PIN is correct
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (attempts - i));
            }

            if (i == attempts) {
                System.out.println("Access denied. Too many failed attempts.");
            }
        }
        scanner.close();
    }
}

