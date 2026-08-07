package ExerciseS;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Nineteen {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("    MULTIPLICATION TABLES");
        System.out.println("====================================");
        for (int table = 1; table < 11; table++) {
            for (int i = 1; i < 11; i++) {
                int result = table * i;
                System.out.println(table + " * " + i +" = "+ result);
            }
            System.out.println("====================================");
        }

    }
}
