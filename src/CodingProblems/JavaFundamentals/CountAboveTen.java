package CodingProblems.JavaFundamentals;

public class CountAboveTen {
    public static int CountAboveTen(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(CountAboveTen(new int[]{5, 12, 8, 20, 15}));
    }
}
