import java.util.Scanner;

class Main3 {
    //to była ta moja pierwsza błędna metoda
    /*
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
   */

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
//avbghfhfva
    public static String palindromeMaker(String str) {

        String wynik = str;
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        // stworzyłem tu dodatkową zmieną typu boolean - zmieniającą swoją wartość w zależności od tego czy dany ciąg jest czy też nie jest palindromem
        boolean isPalindrome = false;
        if (firstChar == lastChar) {
            isPalindrome = true;
            // usuwam pierwszy i ostatni element z łancucha znaków
            if (str.length() > 1) {
                String newStr = str.substring(1, str.length() - 1);
                return palindromeMaker(newStr);
            } else {
                return wynik + "Tak jestem palindromem!";
            }
        } else {
            if (str.length() >= 3) {
                String newStr2 = str.substring(1);
                palindromeMaker(newStr2);
            }

            return wynik + " Isn't palindrome.";
        }



















            // dopisałem tu warunek dotyczący długości:
            // - jeżeli długość równa 1 = to ciąg znaków jest palindromem i go zwracamy
            // - jeżeli długość równa 2 i pierwszy i ostatni znak są sobie równe to jest palindromem
            // - jeżeli długość równa 2 i pierwszy i ostatni znak nie są sobie równe, to nie jest palindromem
            // - tylko mam wątpliwości czy z ifa mogę coś zwrócić, wypisać jakiś wynik tekstowy, ponieważ on z regóły przyjmuje tylko prawdę lub fałsz
            //   czyli to znaczy że zwraca prawdę lub fałsz? czyli to znaczy że nie może wypisać nic innego?


            //if (newStr.length() == 1) {
            //    isPalindrome = true;
            //    return newStr + " This is palindrome";

                // tu dopisałem przypadek dla dwóch znaków które nam zostały, ale bez sensu bo przecież to robi własnie ten warunek wyżej

            /*} else if ((newStr.length() == 2) && (firstChar == lastChar)){
                isPalindrome = true;
                return  newStr + " This is palindrome";
            } else if ((newStr.length() == 2) && (firstChar != lastChar)){
                isPalindrome = false;
                return newStr + " This isn't palindrome";
            }
            */
                    //palindromeMaker(newStr);
                    //if (newStr.length() == 1) {
                    //    isPalindrome = true;
                    //    return newStr + " This is palindrome";
                    //}

                    //return "nothing";

                    //} else{
                    //wynik = "To nie jest palindrom!";
                    //}

                //return wynik;
//            }

    }
    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(PalindromeCreator(s.nextLine()));

        String wynik = palindromeMaker("mmop");
        System.out.println(wynik);

        //System.out.println("wynik: " + palindromeChecker("dddfhhhd"));

    }

}