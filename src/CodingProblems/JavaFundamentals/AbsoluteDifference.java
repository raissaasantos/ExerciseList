package CodingProblems.JavaFundamentals;

public class AbsoluteDifference {
    public static int Difference(int a, int b){

        if (a > b){
            return a - b;
        } else {
            return b - a;
        }

    }

    public static void main(String[] args) {
        System.out.println(Difference(-14,10));
    }
}
