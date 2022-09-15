public class ExerciseBookEggs {
    public static void main(String[] args) {
        int numOfEggs = IBIO.inputInt("Enter the amount of eggs would you like to buy: "); //total eggs count
        int numOfDozens = numOfEggs/12; //# of dozens
        int numOfSingularEggs = numOfEggs%12; //extra apart from the dozen


        if(numOfDozens>-1 && numOfDozens<4){
            double pricePerDozen = 0.50;
            double pricePerSingularEggs = 0.083*pricePerDozen;
            System.out.println("You will pay: $" + ((pricePerDozen*numOfDozens) + (numOfSingularEggs*pricePerSingularEggs)));
        } else if(numOfDozens>3 && numOfDozens<6){
            double pricePerDozen = 0.45;
            double pricePerSingularEggs = 0.083*pricePerDozen;
            System.out.println("You will pay: $" + ((pricePerDozen*numOfDozens) + (numOfSingularEggs*pricePerSingularEggs)));
        } else if(numOfDozens>5 && numOfDozens<11){
            double pricePerDozen = 0.45;
            double pricePerSingularEggs = 0.083*pricePerDozen;
            System.out.println("You will pay: $" + ((pricePerDozen*numOfDozens) + (numOfSingularEggs*pricePerSingularEggs)));
        } else if(numOfDozens>10){
            double pricePerDozen = 0.45;
            double pricePerSingularEggs = 0.083*pricePerDozen;
            System.out.println("You will pay: $" + ((pricePerDozen*numOfDozens) + (numOfSingularEggs*pricePerSingularEggs)));
        } else{
            System.out.println("Please enter a positive number!");
        }
    }
}
