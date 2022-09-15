public class PracticeConditions {
    public static void main(String[] args) {
        //odd or even
        int oddOrEven = IBIO.inputInt("Enter a number: ");
        if (oddOrEven % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
