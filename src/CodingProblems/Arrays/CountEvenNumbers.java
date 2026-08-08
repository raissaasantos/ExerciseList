package CodingProblems.Arrays;

public class CountEvenNumbers {
    public static int CountEven(int[] arr){
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(CountEven(new int[]{1, 2, 4, 7, 9, 10, 12}));
    }
}
