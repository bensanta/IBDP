public class W3ResConditionalStatement2 {
    public static void main(String[] args) {
        //TODO: Write a Java program to solve quadratic equations (use if, else if and else).

        //inputs
        int a = IBIO.inputInt("Input a: ");
        int b = IBIO.inputInt("Input b: ");
        int c = IBIO.inputInt("Input c: ");

        //calculations for roots
        double v = Math.pow(b, 2) - 4 * a * c;
        double root1 = (-b + Math.sqrt(v))/(2*a);
        double root2 = (-b - Math.sqrt(v))/(2*a);

        //output
        if (v < 0){
            System.out.println("The equation has no real roots");
        } else if (v == 0){
            System.out.println("The equation has one root: " + root1);
        } else {
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        }
    }
}
