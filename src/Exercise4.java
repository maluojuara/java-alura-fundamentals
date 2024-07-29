/* Create a program that asks the user for a number and displays the multiplication table for
that number from 1 to 10. */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        int number;

        System.out.println("Please type an integer:");
        number = readNumber.nextInt();

        System.out.println("--- " + "Multiplication table for " + number + " ---");
        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }
    }
}
