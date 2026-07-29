package ExerciseJ;

import java.util.Locale;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the first grade: ");
        double grade = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        double secondGrade = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        double thirdGrade = sc.nextDouble();

        double average = (grade + secondGrade + thirdGrade) / 3;

        System.out.printf("Your average grade is %.1f", average);

        sc.close();
    }
}
