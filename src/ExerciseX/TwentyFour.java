package ExerciseX;

import java.nio.file.attribute.UserPrincipal;
import java.util.Locale;
import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the travel time: ");
        double travelTime = sc.nextDouble();
        System.out.println("Enter the max speed: ");
        double maxSpeed = sc.nextDouble();

        double distance = travelTime * maxSpeed;
        double gasUsed = distance / 12;

        System.out.printf("The distance is %.2f Km \nThe gas used is %.1f liters", distance, gasUsed);

        sc.close();
    }
}
