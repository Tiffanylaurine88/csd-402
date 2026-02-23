/*
 * File: DavidsonArrayListTest.java
 * Author: Tiffany Davidson
 * Course: CSD-402
 * Module: 8.2
 * Date: 02/22/2026
 *
 * Description:
 * This program accepts integer input from the user and stores the values
 * in an ArrayList until the user enters 0. The ArrayList, including the 0,
 * is passed to a static max method which returns the largest value.
 * If the ArrayList is empty, the method returns 0.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DavidsonArrayListTest {

    /*
     * Method: max
     * Description:
     * Receives an ArrayList of Integer values.
     * Returns the largest value in the list.
     * If the list is empty, returns 0.
     *
     * @param list ArrayList containing Integer values
     * @return Integer largest value or 0 if empty
     */
    public static Integer max(ArrayList<Integer> list) {

        // If list is empty, return 0
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        // Loop through list to find largest value
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    /*
     * Method: main
     * Description:
     * Accepts user input and stores integers in an ArrayList.
     * Sends the ArrayList to the max method.
     * Displays the largest value returned.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers. Enter 0 to stop:");

        Integer input;

        // Accept user input until 0 is entered
        do {
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        // Call max method
        Integer largestValue = max(numbers);

        System.out.println("The largest value in the ArrayList is: " + largestValue);

        scanner.close();
    }
}