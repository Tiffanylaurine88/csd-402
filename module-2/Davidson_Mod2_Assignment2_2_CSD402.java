/**
 * Davidson_Mod2_Assignment2_2_CSD402
 *
 * Rock Paper Scissors game.
 * The program randomly generates a number for the computer and compares it to the user's choice.
 *
 * 1 = Rock
 * 2 = Paper
 * 3 = Scissors
 *
 * Author: Tiffany Laurine Davidson
 * Course: CSD-402
 * Module: 2
 * Assignment: 2.2
 * https://github.com/Tiffanylaurine88/csd-402
 */

import java.util.Random;
import java.util.Scanner;

public class Davidson_Mod2_Assignment2_2_CSD402 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock Paper Scissors Game");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        int userChoice = scanner.nextInt();

        String computerMove = convertChoice(computerChoice);
        String userMove = convertChoice(userChoice);

        System.out.println();
        System.out.println("Computer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Result: Invalid choice. Please run again and enter 1, 2, or 3.");
        } else if (computerChoice == userChoice) {
            System.out.println("Result: It is a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        scanner.close();
    }

    private static String convertChoice(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
