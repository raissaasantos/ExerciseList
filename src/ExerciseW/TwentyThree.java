package ExerciseW;

//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
// valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.util.Locale;
import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the class price: ");
        double classPrice = sc.nextDouble();
        System.out.println("Enter the amount of classes per month: ");
        int classPerMonth = sc.nextInt();
        System.out.println("Enter your inss tax percentage: ");
        double inssTax = sc.nextDouble();

        double salary = (classPrice * classPerMonth);
        double liquidSalary = salary - (salary * (inssTax / 100));

        System.out.printf("Liquid salary: $ %.2f", liquidSalary);

        sc.close();
    }
}
