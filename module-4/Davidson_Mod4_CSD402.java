/**
 * Name: Tiffany Davidson
 * Course: CSD 402
 * Module: 4
 * Date: 2026-02-01
 *
 * Description:
 * This program demonstrates method overloading by defining four average methods.
 * Each method calculates and returns the average value of an array using a different
 * numeric data type: short, int, long, and double.
 *
 * A test program invokes each overloaded method using arrays of different sizes.
 * The program then displays the original array elements along with the calculated
 * average value in a readable format.
 */
public class Davidson_Mod4_CSD402 {

  /**
   * The main method is the entry point of the program.
   * It creates arrays of different numeric types and sizes,
   * calls the appropriate overloaded average methods,
   * and displays the results.
   *
   * @param args command line arguments (not used)
   */
  public static void main(String[] args) {

    short[] shortArray = { 5, 10, 15, 20, 25 };
    int[] intArray = { 3, 6, 9, 12, 15, 18, 21 };
    long[] longArray = { 100L, 200L, 300L, 400L };
    double[] doubleArray = { 2.5, 5.0, 7.5, 10.0, 12.5, 15.0 };

    System.out.println("CSD 402 Module 4: Overloaded Average Methods\n");

    displayArrayAndAverage("short", shortArray, average(shortArray));
    displayArrayAndAverage("int", intArray, average(intArray));
    displayArrayAndAverage("long", longArray, average(longArray));
    displayArrayAndAverage("double", doubleArray, average(doubleArray));
  }

  /**
   * Calculates and returns the average value of a short array.
   *
   * @param array the short array containing numeric values
   * @return the average of the array values as a short
   */
  public static short average(short[] array) {
    if (array == null || array.length == 0) {
      return 0;
    }

    long sum = 0;
    for (short value : array) {
      sum += value;
    }

    return (short) (sum / array.length);
  }

  /**
   * Calculates and returns the average value of an int array.
   *
   * @param array the int array containing numeric values
   * @return the average of the array values as an int
   */
  public static int average(int[] array) {
    if (array == null || array.length == 0) {
      return 0;
    }

    long sum = 0;
    for (int value : array) {
      sum += value;
    }

    return (int) (sum / array.length);
  }

  /**
   * Calculates and returns the average value of a long array.
   *
   * @param array the long array containing numeric values
   * @return the average of the array values as a long
   */
  public static long average(long[] array) {
    if (array == null || array.length == 0) {
      return 0L;
    }

    long sum = 0L;
    for (long value : array) {
      sum += value;
    }

    return sum / array.length;
  }

  /**
   * Calculates and returns the average value of a double array.
   *
   * @param array the double array containing numeric values
   * @return the average of the array values as a double
   */
  public static double average(double[] array) {
    if (array == null || array.length == 0) {
      return 0.0;
    }

    double sum = 0.0;
    for (double value : array) {
      sum += value;
    }

    return sum / array.length;
  }

  /**
   * Displays an array of short values and its average.
   *
   * @param typeName the data type name
   * @param array the short array
   * @param avg the calculated average
   */
  private static void displayArrayAndAverage(String typeName, short[] array, short avg) {
    System.out.println("Type: " + typeName);
    System.out.println("Array (" + array.length + " items): " + arrayToString(array));
    System.out.println("Average: " + avg + "\n");
  }

  /**
   * Displays an array of int values and its average.
   */
  private static void displayArrayAndAverage(String typeName, int[] array, int avg) {
    System.out.println("Type: " + typeName);
    System.out.println("Array (" + array.length + " items): " + arrayToString(array));
    System.out.println("Average: " + avg + "\n");
  }

  /**
   * Displays an array of long values and its average.
   */
  private static void displayArrayAndAverage(String typeName, long[] array, long avg) {
    System.out.println("Type: " + typeName);
    System.out.println("Array (" + array.length + " items): " + arrayToString(array));
    System.out.println("Average: " + avg + "\n");
  }

  /**
   * Displays an array of double values and its average.
   */
  private static void displayArrayAndAverage(String typeName, double[] array, double avg) {
    System.out.println("Type: " + typeName);
    System.out.println("Array (" + array.length + " items): " + arrayToString(array));
    System.out.printf("Average: %.2f%n%n", avg);
  }

  /**
   * Converts a short array into a readable string format.
   *
   * @param array the short array
   * @return formatted string representation of the array
   */
  private static String arrayToString(short[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }

  /**
   * Converts an int array into a readable string format.
   */
  private static String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }

  /**
   * Converts a long array into a readable string format.
   */
  private static String arrayToString(long[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }

  /**
   * Converts a double array into a readable string format.
   */
  private static String arrayToString(double[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
}
