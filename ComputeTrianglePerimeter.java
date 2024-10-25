//Exercise 3.19

import java.util.Scanner;

public class ComputeTrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of three edges of a triangle: ");
        double edgeOne = input.nextDouble();
        double edgeTwo = input.nextDouble();
        double edgeThree = input.nextDouble();

        if (edgeOne + edgeTwo > edgeThree && edgeOne + edgeThree > edgeTwo && edgeTwo + edgeThree > edgeOne) {
            System.out.println("The perimeter is " + (edgeOne + edgeTwo + edgeThree));
        } else {
            System.out.println("Invalid input");
        }
    }
}
