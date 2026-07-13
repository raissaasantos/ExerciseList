package ExerciseG;


import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter second value (true/false): ");
        boolean b = sc.nextBoolean();

        if (a == b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        sc.close();
    }
}
