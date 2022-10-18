public class Dictionary {
    public static void main(String[] args) {
        //TODO Modify this algorithm, so that the user has an option
        // to translate from English to Hungarian, or from Hungarian
        // to English. Then accept a word, to translate.

        //Dictionary
        String[][] dictionary = {
                                {"cat", "dog", "house", "cake"}, //0 - English
                                {"macska", "kutya", "haz", "torta"} //1 - Hungarian
                                };
        //User Input
        String userTranslate = IBIO.inputString("Enter a word to translate to the opposite language: ");

        //to check if 404 message has to be printed
        boolean isFound = false;

        for (int i = 0; i < (dictionary[0].length); i++){
            //Checks English word list
            if (dictionary[0][i].equalsIgnoreCase(userTranslate)){
                //Prints the Hungarian Equivalent
                System.out.println(dictionary[1][i]);
                isFound = true;
            }
            //Checks Hungarian word list
            else if (dictionary[1][i].equalsIgnoreCase(userTranslate)) {
                //Prints the English equivalent
                System.out.println(dictionary[0][i]);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Word is not in dictionary. Please try a different word! ");
        }

    }
}
