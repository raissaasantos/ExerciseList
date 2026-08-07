package ExerciseT;

import java.util.Locale;
import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter an integer number: ");
        int table = sc.nextInt();
        System.out.println("====================================");

            for (int i = 1; i < 11; i++) {
                int result = table * i;
                System.out.println(table + " * " + i +" = "+ result);
            }
            sc.close();
    }
}
