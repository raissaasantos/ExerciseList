package CodingProblems.JavaFundamentals;

public class DoubleTheNumber {
    public static int DoubleNumber(int num){

        num = num * 2;

        return num;
    }

    public static void main(String[] args) {
        System.out.println(DoubleNumber(5));
        System.out.println(DoubleNumber(-4));
        System.out.println(DoubleNumber(0));
    }
}
