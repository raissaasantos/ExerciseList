package ExerciseH;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {

        int a = 102;
        int b = 111;
        int c = 273;

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (c > a) {
                System.out.println(b + " " + c + " " + a);
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
