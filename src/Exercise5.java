/* Create a program that asks the user to enter an integer. Check if the number is even or odd
and display a corresponding message. */


import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int number = readNumber.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        if (number % 2 != 0)
            System.out.println("Odd");
    }
}
