import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading =  new Scanner(System.in);

        System.out.println("Type your favorite movie:");
        String movie = reading.nextLine();
        System.out.println(String.format("Your favorite movie is: %s", movie));

        System.out.println("When was it released?");
        int releaseYear = reading.nextInt();
        System.out.println(String.format("Release year: %d", releaseYear));
    }
}
