package CodingProblems.Arrays;

public class SumOfAnArray {
    public static int SumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumArray(new int[]{-2, 4, -1}));
    }
}
