public class WhileLessonActivity3And4 {
    public static void main(String[] args) {
        //TODO: Given a name, for example AISB, print out
        //      AISB
        //      AIS
        //      AI
        //      A

        String name = IBIO.inputString("Please enter your name: ");

        int nameLen = name.length(); //Length of Name
        while (nameLen > 0){
            System.out.println(name.substring(0, nameLen));
            nameLen = nameLen - 1;
        }
    }
}
