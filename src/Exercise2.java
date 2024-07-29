/*Ask the user to enter two integer numbers. Compare the numbers and print a message
indicating whether they are equal, different, if the first is greater,
or if the second is greater.*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner readingNumber = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Please, enter an integer:");
        number1 = readingNumber.nextInt();

        System.out.println("Now enter another integer:");
        number2 = readingNumber.nextInt();

        if (number1 == number2)
            System.out.println("Equal numbers.");

        if (number1 > number2)
            System.out.println("The first number is greater");

        if (number1 < number2)
            System.out.println("The second number is greater");


        readingNumber.close();
    }
}
