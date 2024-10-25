//Exercise 3.14

import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coinFlip = (int)(Math.random() * 2);

        System.out.print("Enter your guess (0 for heads, 1 for tails): ");
        int playerGuess = input.nextInt();

        if (playerGuess == coinFlip) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    }
}
