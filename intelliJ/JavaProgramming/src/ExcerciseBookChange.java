public class ExcerciseBookChange {
    public static void main(String[] args) {
        int requestedChange = IBIO.inputInt("Enter the amount of change in cents: ");
        int quarters = requestedChange/25;
        int dimes = (requestedChange%25)/10;
        int nickels = ((requestedChange%25)%10)/5;
        int pennies = (((requestedChange%25)%10)%5)/1;
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
