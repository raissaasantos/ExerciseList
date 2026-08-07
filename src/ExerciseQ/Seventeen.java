package ExerciseQ;


import java.util.Locale;
import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheitTemp = sc.nextDouble();

        double celsiusTemp = 5 * (fahrenheitTemp - 32) / 9;

        System.out.println("======================================\nFahrenheit to Celsius \n======================================\n");
        System.out.printf("Fahrenheit: %.1f F°%nCelsius: %.1f C°", fahrenheitTemp, celsiusTemp);


        sc.close();

    }
}
