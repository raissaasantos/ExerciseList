package ExerciseV;

import java.util.Locale;
import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int divisionRest = A % B;
        System.out.println(divisionRest);

        sc.close();
    }
}
