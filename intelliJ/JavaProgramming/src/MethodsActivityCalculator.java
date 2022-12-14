public class MethodsActivityCalculator
{
    public static void main(String[] args)
    {
        int option;
        do
        {
            menu();
            option=IBIO.inputInt("Select your option: ");

            switch (option) {
                case 0 -> System.out.println("Thank you for using the calculator");
                case 1 -> addition();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                case 5 -> squareRoot();
                default -> System.out.println("Invalid option, please try again");
            }
        }
        while (option!=0);
    }

    public static void menu() {
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Square Root");
        System.out.println("0: Quit");
    }
    public static void addition() {
        //1.Accept two numbers
        int num1 = IBIO.inputInt("Enter the first number: ");
        int num2 = IBIO.inputInt("Enter the second number: ");
        //2.Calculate the total
        int total = num1 + num2;
        //3.Display the result
        System.out.println("The total is: " + total);
    }
    public static void subtraction() {
        //1.Accept two numbers
        int num1 = IBIO.inputInt("Enter the first number: ");
        int num2 = IBIO.inputInt("Enter the second number: ");
        //2.Calculate the total
        int total = num1 - num2;
        //3.Display the result
        System.out.println("The total is: " + total);
    }
    public static void multiplication() {
        //1.Accept two numbers
        int num1 = IBIO.inputInt("Enter the first number: ");
        int num2 = IBIO.inputInt("Enter the second number: ");
        //2.Calculate the total
        int total = num1 * num2;
        //3.Display the result
        System.out.println("The total is: " + total);
    }
    public static void division() {
        //1.Accept two numbers
        int num1 = IBIO.inputInt("Enter the first number: ");
        int num2 = IBIO.inputInt("Enter the second number: ");
        //2.Calculate the total
        int total = num1 / num2;
        //3.Display the result
        System.out.println("The total is: " + total);
    }
    public static void squareRoot() {
        //1.Accept a number
        int num1 = IBIO.inputInt("Enter the number: ");
        //2.Calculate the square root and display the result
        System.out.println("The square root is: " + Math.sqrt(num1));
    }
}