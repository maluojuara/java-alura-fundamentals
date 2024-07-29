import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner reading =  new Scanner(System.in);

        double rating = 0;
        double averageRating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("What is your rating for the movie?");
            rating = reading.nextDouble();
            averageRating += rating;
        }

        averageRating /= 3;

        System.out.println(String.format("Average rating is: %.2f", averageRating));
    }
}
