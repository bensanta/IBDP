public class ExerciseBookQuadraticEquation {
    public static void main(String[] args) {
        //TODO: Create a program that gives the solution to the quadratic equation
        //      ax^2 + bx + c = 0
        //      The program should ask the user for the values of a, b, and c
        //      The program should output the solutions to the equation
        //      If there are no solutions, the program should output "No solutions"
        //      If there is one solution, the program should output "One solution: x = <solution>"
        //      If there are two solutions, the program should output "Two solutions: x = <solution1> and x = <solution2>"

        double a = IBIO.inputDouble("Enter the value of a: ");
        double b = IBIO.inputDouble("Enter the value of b: ");
        double c = IBIO.inputDouble("Enter the value of c: ");

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0){
            System.out.println("No solutions");
        } else if (discriminant == 0){
            double solution = -b / (2 * a);
            System.out.println("One solution: x = " + solution);
        } else {
            double solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two solutions: x = " + solution1 + " and x = " + solution2);
        }
    }
}
