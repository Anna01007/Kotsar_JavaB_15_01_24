package hw6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(11); // Random number from 0 to 10 (up to 11 not inclusive)
        int maximumAttempts = 3;

        System.out.println("Guess a number between 0 and 10. You have 3 tries.");

        for (int attempt = 1; attempt <= maximumAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your option: ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Oh my God! Wow! Yes, this is number " + secretNumber + ".You guessed it on " + attempt + " try!");
                return;
            } else {
                System.out.println("Unfortunately no, not right. Let's try again :(");
            }
        }
        System.out.println("Game Over. The desired number was: " + secretNumber + " Thank you!.");
    }
}
