//Create a program that prompts the user for a number and calculates the factorial of that number.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int number = readNumber.nextInt();
        int factorial = 1;
        int numberOut = number;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("Factorial of " + numberOut + " is " + factorial);
    }
}
