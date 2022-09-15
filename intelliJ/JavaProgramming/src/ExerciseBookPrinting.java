public class ExerciseBookPrinting {
    public static void main(String[] args) {
        int numOfCopies = IBIO.inputInt("Enter the number of copies you'd like printed: ");
        if (numOfCopies >= 0 && numOfCopies <= 99){
            double pricePerCopy = 0.30;
            System.out.println("The price per copy is: " + pricePerCopy);
            System.out.println("Total cost is: " + pricePerCopy * numOfCopies);
        } else if (numOfCopies >= 100 && numOfCopies <= 499) {
            double pricePerCopy = 0.28;
            System.out.println("The price per copy is: " + pricePerCopy);
            System.out.println("Total cost is: " + pricePerCopy * numOfCopies);
        } else if(numOfCopies >= 500 && numOfCopies <= 749){
            double pricePerCopy = 0.27;
            System.out.println("The price per copy is: " + pricePerCopy);
            System.out.println("Total cost is: " + pricePerCopy * numOfCopies);
        } else if (numOfCopies >= 750 && numOfCopies <= 1000) {
            double pricePerCopy = 0.26;
            System.out.println("The price per copy is: " + pricePerCopy);
            System.out.println("Total cost is: " + pricePerCopy * numOfCopies);
        } else if(numOfCopies > 1000) {
            double pricePerCopy = 0.25;
            System.out.println("The price per copy is: " + pricePerCopy);
            System.out.println("Total cost is: " + pricePerCopy * numOfCopies);
        } else {
            System.out.println("Please enter a positive value!");
        }
    }
}
