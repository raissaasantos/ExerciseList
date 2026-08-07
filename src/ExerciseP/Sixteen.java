package ExerciseP;

import java.util.Locale;
import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===============================================\n" +
                "Is it a triangle?\n===============================================\n");
        System.out.println("Enter the first value: ");
        double sideA = sc.nextDouble();
        System.out.println("Enter the second value: ");
        double sideB = sc.nextDouble();
        System.out.println("Enter the third value: ");
        double sideC = sc.nextDouble();

        if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){
            if (sideA == sideB && sideB == sideC){
                System.out.println("It's an Equilateral triangle!");
            } else if (sideA == sideB && sideC != sideB) {
                System.out.println("It's an Isosceles triangle!");
            } else {
                System.out.println("It's a Scalene triangle!");
            }
        } else {
            System.out.println("It's not a triangle");
        }


        sc.close();
    }
}
