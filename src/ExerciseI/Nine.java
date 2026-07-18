package ExerciseI;

import java.util.Locale;
import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===================================\n           IMC CALCULATOR      " +
                "\n===================================\n Enter your weight(ex: 55.2): ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height(ex: 1.64): ");
        double height = sc.nextDouble();
        double imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.printf("IMC: %.2f%nBelow 18.5 | Underweight%n", imc);
        } else if (imc < 25.0) {
            System.out.printf("IMC: %.2f%nBetween 18.5 and 24.9 | Normal weight%n", imc);
        } else if (imc < 30.0) {
            System.out.printf("IMC: %.2f%nBetween 25.0 and 29.9 | Overweight%n", imc);
        } else if (imc < 35.0) {
            System.out.printf("IMC: %.2f%nBetween 30.0 and 34.9 | Obesity Class I%n", imc);
        } else if (imc < 40.0) {
            System.out.printf("IMC: %.2f%nBetween 35.0 and 39.9 | Obesity Class II%n", imc);
        } else {
            System.out.printf("IMC: %.2f%n40.0 or higher | Obesity Class III%n", imc);
        }

        sc.close();
    }


}
