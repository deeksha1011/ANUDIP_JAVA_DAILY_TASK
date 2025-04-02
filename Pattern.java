public class Pattern {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print letters
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            // Print spaces
            for (int space = 1; space <= (n - i) * 2; space++) {
                System.out.print("  ");
            }

            // Print #
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }
}
