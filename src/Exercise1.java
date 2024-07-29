/* Create a program that prompts the user to enter a number. If the number is positive, display
"Positive number", otherwise, display "Negative number".*/

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner readingNumber = new Scanner(System.in);
        int number;

        System.out.println("Please enter an integer:");
        number = readingNumber.nextInt();

        if (number == 0)
            System.out.println("The number is null.");

        if (number > 0)
            System.out.println("It's a positive number.");

        if (number < 0)
            System.out.println("It's a negative number.");

        readingNumber.close();
    }
}
