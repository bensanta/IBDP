import java.util.Scanner;

public class PizzaCostLesson3Excercise2 {
    public static void main(String[] args) {
        // TODO make varialbes for labour and rent cost, to be able to expand the program further
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the diameter of the pizza in inches: ");

        //Labour cost 0.75
        //Rent cost 1.00
        //Materials cost 0.05*diameter*diameter


        double pizzaSizeInInches = myObj.nextDouble(); // Read user input
        double pizzaCost = 0.75+1.00+(0.05*pizzaSizeInInches*pizzaSizeInInches);

        System.out.println("The cost of making the pizza is: $" + pizzaCost);
    }
}
