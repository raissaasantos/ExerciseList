package ExerciseO;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu,
// imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//Considerando o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)

import java.util.Locale;
import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the day you were born: ");
        int birthDay = sc.nextInt();
        System.out.print("Enter the month you were born: ");
        int birthMonth = sc.nextInt();
        System.out.print("Enter the year you were born: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter the current day: ");
        int currentDay = sc.nextInt();
        System.out.print("Enter the current month: ");
        int currentMonth = sc.nextInt();
        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

        int livingDays = (birthYear * 365) + (birthMonth * 30) + birthDay;
        int currentDate = (currentYear * 365) + (currentMonth * 30) + currentDay;

        int remainingTime = currentDate - livingDays;

        int years = remainingTime / 365;
        int remainingDays = remainingTime % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;


        System.out.printf("%d years, %d months and %d days.%n", years, months, days);

        sc.close();
    }
}
