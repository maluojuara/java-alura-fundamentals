public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Top Gun");

        int releaseYear = 2022;
        System.out.println("Release year: " + releaseYear + "\n");

        boolean isIncludedOnPlan = false;
        double rating = 8.2;

        double averageRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(averageRating + "\n");

        String synopsis = """
            Movie: Top Gun
            Adventure movie with an actor from the 80s.
            
            Rating: %.2f.
            Average: %.2f.
            
            """.formatted(rating, averageRating);
        System.out.println(String.format("Synopsis: %s", synopsis));

        int stars = (int) (averageRating/2);
        System.out.println(String.format("Stars: %d", stars));
    }
}