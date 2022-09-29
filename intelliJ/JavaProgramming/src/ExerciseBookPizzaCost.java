import java.util.Scanner;

public class ExerciseBookPizzaCost {
    public static void main(String[] args) {
        // TODO make variables for labour and rent cost, to be able to expand the program further
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the diameter of the pizza in inches: ");

        double pizzaSizeInInches = myObj.nextDouble(); // Read user input

        double labourCost = 0.75;
        double rentCost = 1.00;
        double materialsCost = 0.05*pizzaSizeInInches*pizzaSizeInInches;
        double pizzaCost = labourCost + rentCost + materialsCost;

        System.out.println("The cost of making the pizza is: $" + pizzaCost);
    }
}
