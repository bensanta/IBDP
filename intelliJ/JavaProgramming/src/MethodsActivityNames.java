public class MethodsActivityNames {
    public static void main(String[] args) {
        //TODO - Accept words from the keyboard. Terminate the application when the user enters STOP.
        // Print out number of words starting with letter "A" and letter "B"

        String name;

        int numOfA = 0;
        int numOfB = 0;
        do {
            name = IBIO.inputString("Enter an item's name: ");
            if (name.substring(0,1).equalsIgnoreCase("a")){
                numOfA++;
            } else if (name.substring(0,1).equalsIgnoreCase("b")) {
                numOfB++;
            }
        } while (!name.equalsIgnoreCase("stop"));
        System.out.println(numOfA + " word(s) start with the letter A");
        System.out.println(numOfB + " word(s) start with the letter B");
    }
}
