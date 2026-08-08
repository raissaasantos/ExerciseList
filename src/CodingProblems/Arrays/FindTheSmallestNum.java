package CodingProblems.Arrays;

public class FindTheSmallestNum {
    public static int FindSmallest(int[] arr){
        int smallerNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallerNumber) {
                smallerNumber = arr[i];
            }
        }
        return smallerNumber;
    }

    public static void main(String[] args) {
        System.out.println(FindSmallest(new int[]{8, 3, 10, 2, 7}));
    }
}
