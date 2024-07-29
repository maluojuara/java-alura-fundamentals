/* Create a menu that offers two options to the user: '1. Calculate the area of the square' and
'2. Calculate the area of the circle'. Ask the user to make a choice and perform the area
calculation based on the selected option. */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner readingData = new Scanner(System.in);
        int choice;

        System.out.println("Hello! Choose option 1 for square or option 2 for circle:");
        choice = readingData.nextInt();

        if (choice == 1) {
            double sideSquare = 0;
            System.out.println("Enter the side length of the square (in cm):");
            sideSquare = readingData.nextDouble();
            System.out.println(String.format("The area of this square is %.2f cm²", sideSquare * sideSquare));
        }
        if (choice == 2) {
            double circleRadius = 0;
            double pi = 3.14159;
            System.out.println("Enter the circle radius (in cm):");
            circleRadius = readingData.nextDouble();
            System.out.println(String.format("The area of this circle is %.2f cm²", pi * circleRadius * circleRadius));

        }
        else
            System.out.println("Invalid number choice. Try again!");
    }
}
