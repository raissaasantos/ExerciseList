package ExerciseR;

public class Eighteen {
    public static void main(String[] args) {

        double franHeight = 1.50;
        double saraHeight = 1.10;

        int years = 0;

        while (franHeight > saraHeight){
            franHeight += 0.02;
            saraHeight += 0.03;
            years++;
        }

        System.out.printf("It will take %d years for Sara to be taller than Fran", years);
    }
}
