public class ExerciseBookOrder {
    public static void main(String[] args) {
        double burgerPrice = 1.69;
        double friesPrice = 1.09;
        double sodasPrice = 0.99;
        double burgerQuantity = IBIO.inputInt("Enter the number of burgers: ");
        double friesQuantity = IBIO.inputInt("Enter the number of fries: ");
        double sodasQuantity = IBIO.inputInt("Enter the number of sodas: ");

        //rounded to 2 decimal places
        double subtotal = Math.round((burgerPrice * burgerQuantity + friesPrice * friesQuantity + sodasPrice * sodasQuantity) * 100.0) / 100.0;
        double tax = Math.round((subtotal * 0.065)*100.0)/100.0;
        double total = Math.round((subtotal + tax)*100.0)/100.0;

        //final output
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}