package CodingProblems.Arrays;

public class FindTheLargestNumber {
    public static int FindLargest(int[] arr){
        int largestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        System.out.println(FindLargest(new int[]{7}));
    }
}
