package CodingProblems.Strings;

public class CountVowels {
    public static int countVowels(String str){

        int vowelsCounter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelsCounter += 1;
            } else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                vowelsCounter += 1;
            }
        }
        return vowelsCounter;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("HELLO"));
    }
}
