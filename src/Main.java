import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz dowolny ciąg znaków");
        String str = scanner.nextLine();
        Main.NonrepeatingCharacter(str);
    }

    public static void NonrepeatingCharacter (String str){
        System.out.println("Działa: " + str);
        for (int i = 0; i<str.length(); i++){
            char singleChar = str.charAt(i);
            boolean haveDuplicate = false;
            int counter = 0;
            for (int j = 0; j<str.length(); j++){
                char singleChar2 = str.charAt(j);
                if (singleChar == singleChar2){
                    counter++;
                }
                if (counter > 1) {
                    haveDuplicate = true;
                }
            }
            if (!haveDuplicate) {
                System.out.println(singleChar);
            }
        }
    }
}
