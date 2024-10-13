//Exercise 3.7

import java.util.Scanner;

public class ComputeChangeModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in integer, for example 1156 for $11.56: ");
        int remainingAmount = input.nextInt();

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + remainingAmount + " consists of:");
        if (numberOfOneDollars > 0) {
            if (numberOfOneDollars == 1) {
                System.out.println("    " + numberOfOneDollars + " dollar,");
            } else {
                System.out.println("    " + numberOfOneDollars + " dollars,");
            }
        }
        if (numberOfQuarters > 0) {
            if (numberOfQuarters == 1) {
                System.out.println("    " + numberOfQuarters + " quarter,");
            } else {
                System.out.println("    " + numberOfQuarters + " quarters,");
            }
        }
        if (numberOfDimes > 0) {
            if (numberOfDimes == 1) {
                System.out.println("    " + numberOfDimes + " dime,");
            } else {
                System.out.println("    " + numberOfDimes + " dimes,");
            }
        }
        if (numberOfNickels > 0) {
            if (numberOfNickels == 1) {
                System.out.println("    " + numberOfNickels + " nickel,");
            } else {
                System.out.println("    " + numberOfNickels + " nickels,");
            }
        }
        if (numberOfPennies > 0) {
            if (numberOfPennies == 1) {
                System.out.println("and " + numberOfPennies + " penny.");
            } else {
                System.out.println("and " + numberOfPennies + " pennies.");
            }
        }
    }
}
