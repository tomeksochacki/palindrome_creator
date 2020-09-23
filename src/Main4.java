class Main4 {
    public static void main(String[] args) {

        System.out.println(Main4.palindromCreator2("abla"));

    }

    public static String palindromCreator2(String exampleWord){
        boolean isPalindrom = false;
        if ((exampleWord.length() == 0) || (exampleWord.length() == 1)){
            isPalindrom = true;
            return exampleWord + " This is palindrom";
        } else if (exampleWord.length() > 1 ){
            //char firstCharacter = exampleWord.charAt(0);
            //char lastCharacter = exampleWord.charAt(exampleWord.length()-1);
            for (int i = 0; i < exampleWord.length(); i++){
                char firstCharacter = exampleWord.charAt(i);
                char lastCharacter = exampleWord.charAt(exampleWord.length()-1-i);
                if (firstCharacter != lastCharacter){
                    isPalindrom = false;
                } else {
                    String shortString = exampleWord.substring(1, exampleWord.length()-1);
                    palindromCreator2(shortString);
                }
            }
        }

        return exampleWord;
    }
}
