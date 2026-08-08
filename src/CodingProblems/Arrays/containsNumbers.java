package CodingProblems.Arrays;

public class containsNumbers {
    public static boolean Contains(int[] arr, int target){

        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Contains(new int[]{3, 8, 7, 12, 9, 5}, 7));
    }
}
