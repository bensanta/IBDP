public class ExerciseBookSpending {
    public static void main(String[] args) {
        System.out.println("Enter the amount spent last month on the following items: ");

        int food = IBIO.inputInt("Food: ");
        int clothing = IBIO.inputInt("Clothing: ");
        int entertainment = IBIO.inputInt("Entertainment: ");
        int rent = IBIO.inputInt("Rent: ");
        //total
        int total = food + clothing + entertainment + rent;

        //percentage
        double foodPercent = (double) food / total * 100;
        double clothingPercent = (double) clothing / total * 100;
        double entertainmentPercent = (double) entertainment / total * 100;
        double rentPercent = (double) rent / total * 100;

        //output to user
        System.out.println("CATEGORY + BUDGET");
        System.out.println("Food: " + foodPercent + "%");
        System.out.println("Clothing: " + clothingPercent + "%");
        System.out.println("Entertainment: " + entertainmentPercent + "%");
        System.out.println("Rent: " + rentPercent + "%");

    }
}
