/**
 * File: Davidson_Mod5_CSD402.java
 * Course: CSD-402
 * Module: 5
 * Author: Tiffany Davidson
 * Date: February 8, 2026
 *
 * Purpose:
 * This program demonstrates overloaded methods that locate the position
 * of the largest and smallest elements in a two-dimensional array.
 *
 * Requirements Covered:
 * 1) locateLargest(double[][]) returns int[] {row, col}
 * 2) locateLargest(int[][]) returns int[] {row, col}
 * 3) locateSmallest(double[][]) returns int[] {row, col}
 * 4) locateSmallest(int[][]) returns int[] {row, col}
 *
 * Assumptions:
 * - The arrays passed into these methods are not null.
 * - The arrays have at least one row and one column.
 * - Rows may have different lengths (jagged arrays are supported).
 */

public class Davidson_Mod5_CSD402 {

    /**
     * Finds the location of the largest element in a two-dimensional double array.
     *
     * Preconditions:
     * - arrayParam is not null
     * - arrayParam has at least one element (arrayParam.length > 0 and arrayParam[0].length > 0)
     *
     * Postconditions:
     * - Returns a one-dimensional int array of size 2:
     *   index 0 is the row, index 1 is the column of the largest value.
     *
     * @param arrayParam the two-dimensional double array to search
     * @return int[] containing {rowIndex, colIndex} of the largest element
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        double bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[]{bestRow, bestCol};
    }

    /**
     * Finds the location of the largest element in a two-dimensional int array.
     *
     * Preconditions:
     * - arrayParam is not null
     * - arrayParam has at least one element (arrayParam.length > 0 and arrayParam[0].length > 0)
     *
     * Postconditions:
     * - Returns a one-dimensional int array of size 2:
     *   index 0 is the row, index 1 is the column of the largest value.
     *
     * @param arrayParam the two-dimensional int array to search
     * @return int[] containing {rowIndex, colIndex} of the largest element
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        int bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[]{bestRow, bestCol};
    }

    /**
     * Finds the location of the smallest element in a two-dimensional double array.
     *
     * Preconditions:
     * - arrayParam is not null
     * - arrayParam has at least one element (arrayParam.length > 0 and arrayParam[0].length > 0)
     *
     * Postconditions:
     * - Returns a one-dimensional int array of size 2:
     *   index 0 is the row, index 1 is the column of the smallest value.
     *
     * @param arrayParam the two-dimensional double array to search
     * @return int[] containing {rowIndex, colIndex} of the smallest element
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        double bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[]{bestRow, bestCol};
    }

    /**
     * Finds the location of the smallest element in a two-dimensional int array.
     *
     * Preconditions:
     * - arrayParam is not null
     * - arrayParam has at least one element (arrayParam.length > 0 and arrayParam[0].length > 0)
     *
     * Postconditions:
     * - Returns a one-dimensional int array of size 2:
     *   index 0 is the row, index 1 is the column of the smallest value.
     *
     * @param arrayParam the two-dimensional int array to search
     * @return int[] containing {rowIndex, colIndex} of the smallest element
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int bestRow = 0;
        int bestCol = 0;
        int bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[]{bestRow, bestCol};
    }

    /**
     * Prints a two-dimensional double array in a readable grid format.
     *
     * @param arr the two-dimensional double array to print
     */
    private static void print2D(double[][] arr) {
        for (double[] row : arr) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    /**
     * Prints a two-dimensional int array in a readable grid format.
     *
     * @param arr the two-dimensional int array to print
     */
    private static void print2D(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.printf("%6d", value);
            }
            System.out.println();
        }
    }

    /**
     * Program entry point. Builds sample arrays, calls each required method,
     * and prints the results so the output can be verified easily.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        double[][] doubleArray = {
                {2.30, 5.60, 1.20},
                {9.80, 4.40, 3.30},
                {7.70, 8.10, 0.50}
        };

        int[][] intArray = {
                {7, 2, 9, 4},
                {1, 5, 6, 3},
                {8, 0, 2, 10}
        };

        System.out.println("Double Array:");
        print2D(doubleArray);
        int[] largestDoubleLoc = locateLargest(doubleArray);
        int[] smallestDoubleLoc = locateSmallest(doubleArray);
        System.out.println("Largest double at row " + largestDoubleLoc[0] + ", col " + largestDoubleLoc[1]);
        System.out.println("Smallest double at row " + smallestDoubleLoc[0] + ", col " + smallestDoubleLoc[1]);
        System.out.println();

        System.out.println("Int Array:");
        print2D(intArray);
        int[] largestIntLoc = locateLargest(intArray);
        int[] smallestIntLoc = locateSmallest(intArray);
        System.out.println("Largest int at row " + largestIntLoc[0] + ", col " + largestIntLoc[1]);
        System.out.println("Smallest int at row " + smallestIntLoc[0] + ", col " + smallestIntLoc[1]);
    }
}
