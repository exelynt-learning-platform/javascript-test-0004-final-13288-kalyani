public class NumberSquarePattern {
    public static void main(String[] args) {
        int n = 4;  // The highest number in the outermost square (this determines the size of the pattern)
        int size = 2 * n - 1;  // Size of the square (rows and columns)

        // Loop through rows
        for (int i = 0; i < size; i++) {

            // Loop through columns
            for (int j = 0; j < size; j++) {

                // Calculate the minimum distance to any of the edges (top, bottom, left, right)
                int min = Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));

                // Print the number that corresponds to the minimum distance (this forms the concentric square)
                System.out.print((n - min) + " ");
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
