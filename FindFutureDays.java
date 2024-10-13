//Exercise 3.5

import java.util.Scanner;

public class FindFutureDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int future = (today + elapsedDays) % 7;

        String todaysDay = "";

        if (today == 0) {
            todaysDay = "Sunday";
        } else if (today == 1) {
            todaysDay = "Monday";
        } else if (today == 2) {
            todaysDay = "Tuesday";
        } else if (today == 3) {
            todaysDay = "Wednesday";
        } else if (today == 4) {
            todaysDay = "Thursday";
        } else if (today == 5) {
            todaysDay = "Friday";
        } else if (today == 6) {
            todaysDay = "Saturday";
        }

        String futuresDay = "";

        if (future == 0) {
            futuresDay = "Sunday";
        } else if (future == 1) {
            futuresDay = "Monday";
        } else if (future == 2) {
            futuresDay = "Tuesday";
        } else if (future == 3) {
            futuresDay = "Wednesday";
        } else if (future == 4) {
            futuresDay = "Thursday";
        } else if (future == 5) {
            futuresDay = "Friday";
        } else if (future == 6) {
            futuresDay = "Saturday";
        }

        System.out.println("Today is " + todaysDay + " and the future day is " + futuresDay);
    }
}
