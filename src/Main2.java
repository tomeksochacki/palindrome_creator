import java.util.Scanner;
import java.lang.String;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        nonRepeatingCharacter(word);

    }

    public static void nonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                char char2 = str.charAt(j);
                if (char1 == char2) {
                    counter++;
                }
            }
            if (counter < 2) {
                System.out.println(char1);
            }
        }
    }
}
