public class ChangeExcerciseBook {
    public static void main(String[] args) {
        int requestedChange = IBIO.inputInt("Enter the amount of change in cents: ");
        //penny = 1 cent
        //nickels = 5 cent
        //dimes = 10 cent
        //quarters = 25 cent

        int quarterWorth = 25;
        int dimeWorth = 10;
        int nickelWorth = 5;
        int pennyWorth = 1;
        int finalTotal; //Final Total to be printed

        int moneyInQuarters = requestedChange / 25;
        int remainingAfterQuarters = requestedChange - moneyInQuarters*quarterWorth;

        int moneyInDimes = remainingAfterQuarters / dimeWorth;
        int remainingAfterDimes = requestedChange - moneyInDimes*dimeWorth;

        int moneyInNickels = remainingAfterDimes / nickelWorth;
        int remainingAfterNickels = requestedChange - moneyInNickels*nickelWorth;

        int moneyInPennies = remainingAfterNickels / pennyWorth;
        int remainingAfterPennies = requestedChange - moneyInPennies*pennyWorth;

        System.out.println("Quarters: " + remainingAfterQuarters);
        System.out.println("Dimes: " + remainingAfterDimes);
        System.out.println("Nickel: " + remainingAfterNickels);
        System.out.println("Penny: " + remainingAfterPennies);


    }
}
