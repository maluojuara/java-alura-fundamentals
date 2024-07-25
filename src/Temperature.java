public class Temperature {
    public static void main(String[] args) {
        double celsiusTemperature = 25.2;
        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;

        System.out.println(String.format("%.2f", fahrenheitTemperature));
    }
}
