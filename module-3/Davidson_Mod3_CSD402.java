/**
 * Davidson_Mod3_CSD402
 *
 * Outputs a formatted pyramid using nested for loops.
 * Each row shows powers of 2 increasing to the center, then decreasing.
 * An @ symbol is printed at the end of each line.
 *
 * Author: Tiffany Laurine Davidson
 * Course: CSD-402
 * https://github.com/Tiffanylaurine88/csd-402
 * Module: 3
 */

public class Davidson_Mod3_CSD402 {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            int leadingSpaces = (rows - 1 - i) * 2;
            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                int value = (int) Math.pow(2, j);
                System.out.print(value);

                if (j < i) {
                    System.out.print(" ");
                }
            }

            for (int j = i - 1; j >= 0; j--) {
                int value = (int) Math.pow(2, j);
                System.out.print(" ");
                System.out.print(value);
            }

            System.out.print(" ");
            System.out.println("@");
        }
    }
}
