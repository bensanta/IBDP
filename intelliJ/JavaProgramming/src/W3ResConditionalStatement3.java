public class W3ResConditionalStatement3 {
    public static void main(String[] args) {
        //TODO: Take three numbers from the user and print the greatest number.

        //inputs
        int num1 = IBIO.inputInt("Input first number: ");
        int num2 = IBIO.inputInt("Input second number: ");
        int num3 = IBIO.inputInt("Input third number: ");

        //output
        if (num1 > num2 && num1 > num3){
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The greatest number is: " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("The greatest number is: " + num3);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
