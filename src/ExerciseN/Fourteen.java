package ExerciseN;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e
// o valor de B por A e imprima na tela os valores.

public class Fourteen {
    public static void main(String[] args) {

        int A = 10;
        int B = 34;

        int temp = A;
        A = B;
        B = temp;

        System.out.println("A: "+ A);
        System.out.println("B: "+ B);

    }
}
