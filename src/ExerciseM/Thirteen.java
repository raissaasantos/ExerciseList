package ExerciseM;
 /*13 - Faça um algoritmo que leia o nome e a idade de uma peso e
imprima na tela o nome da pessoa e se ela é maior ou menor de idade.*/

import java.util.Locale;
import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You're an adult");
        } else {
            System.out.println("You're underage");
        }

        sc.next();
    }
}
