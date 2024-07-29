import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner reading =  new Scanner(System.in);

        double rating = 0;
        double averageRating = 0;
        int count = 0;

        while (rating != -1) {
            System.out.println("What is your rating for the movie? Or type -1 to finish");
            rating = reading.nextDouble();

            if (rating != -1) {
                averageRating += rating;
                count++;
            }
        }

        averageRating /= count;

        System.out.println(String.format("Average rating is: %.2f", averageRating));
    }
}
