package ExerciseK;

import java.util.Locale;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your first grade: ");
        double firstGrade = sc.nextDouble();
        System.out.println("Enter your second grade: ");
        double secondGrade = sc.nextDouble();
        System.out.println("Enter your third grade: ");
        double thirdGrade = sc.nextDouble();
        System.out.println("Enter your fourth grade: ");
        double fourthGrade = sc.nextDouble();

        double average = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;

        System.out.printf("Name: %s%nAverage grade: %.1f%n", name, average);

        if (average >= 7){
            System.out.println("Status: Approved");
        } else {
            System.out.println("Status: Failed");
        }

        sc.close();
    }
}
