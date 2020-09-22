import java.util.Scanner;

class Main3 {

    public static String PalindromeCreator(String str) {
        for (int i = 0; i<str.length(); i++){
            char character = str.charAt(i);
            boolean isPalindrome;
            for (int j = str.length()-1; j>=0; j--){
                char character2 = str.charAt(j);
                if (character == character2){
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }
        }
        return str;
    }

    public static boolean palindromeChecker(String stringExample){
        boolean score = true;
        for (int i = 0; i<stringExample.length(); i++ ){
            char firstChar = stringExample.charAt(i);
            char lastChar = stringExample.charAt(stringExample.length()-1-i);
            if (firstChar != lastChar){
                score = false;
            }
        }
        return score;
    }

    public static String palindromeMaker(String str){
        String wynik = str;
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        if (firstChar == lastChar){
            // usuwam pierwszy i ostatni element z łancucha znaków
            String newStr = str.substring(1, str.length() - 1);
            palindromeMaker(newStr);
            return "nothing";
        } else {
            wynik = "To nie jest palindrom!";
        }
        return wynik;
    }

    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(PalindromeCreator(s.nextLine()));

        String wynik = palindromeMaker("abla");
        System.out.println("wynik: " + wynik);

    }

}