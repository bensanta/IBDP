public class W3ResConditionalStatement1 {
    public static void main(String[] args) {
        //TODO: Write a Java program to get a number from the user and print whether it is positive or negative.
        int userNum = IBIO.inputInt("Input number: ");
        if (userNum > 0){
            System.out.println("Number is positive");
        } else if (userNum < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
