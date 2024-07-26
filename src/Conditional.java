public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean isIncludedOnPlan = false;
        double rating = 8.2;

        if (releaseYear >= 2022 && rating >= 8){
            System.out.println("Recent movie with good rating!");
        }
    }
}
