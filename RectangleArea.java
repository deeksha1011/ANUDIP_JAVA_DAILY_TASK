import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for length and width
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculating area
        double area = length * width;

        // Displaying the result
        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}
