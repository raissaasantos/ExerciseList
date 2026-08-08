package CodingProblems.JavaFundamentals;

public class IsItEven {

    public static boolean IsEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(IsEven(-6));
    }
}
