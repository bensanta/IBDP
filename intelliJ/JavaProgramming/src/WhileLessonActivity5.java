public class WhileLessonActivity5 {
    public static void main(String[] args) {
        //TODO: Accept a name, and print out characters in reverse order. For example AISB becomes BSIA
        String name = IBIO.inputString("Please enter your name: ");
        System.out.println();
        int i = 0;

        while (i < name.length()){
            System.out.print(name.charAt(name.length()-1-i));
            i++;


        }


    }
}
