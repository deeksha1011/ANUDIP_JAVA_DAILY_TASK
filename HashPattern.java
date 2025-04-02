public class HashPattern {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print '#' symbols
            for (int j = i; j <= n; j++) {
                System.out.print("# ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
