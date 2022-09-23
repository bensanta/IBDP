public class ExerciseBookGuessingGame {
    public static void main(String[] args) {
        //TODO: Guessing Game - Have the user guess between 1 and 20, and compare it to the computer's generated number
        //      If the user's guess mathches the computer's number, output "You Won!"
        //      If the user's guess doesn't match the computer's number, output "Better luck next time!"

        int computerNumber = (int)(Math.random() * 20) + 1;
        int userGuess = IBIO.inputInt("Guess a number between 1 and 20: ");
        if (userGuess >= 1 && userGuess <= 20){
            if (userGuess == computerNumber){
                System.out.println("The computer's number was: " + computerNumber);
                System.out.println("The player's number was:  " + userGuess);

                System.out.println("You Won!");
            } else {
                System.out.println("The computer's number was: " + computerNumber);
                System.out.println("The player's number was:  " + userGuess);

                System.out.println("Better luck next time!");
            }
        } else {
            System.out.println("Invalid number! Enter a value between 1 and 20!");
        }
    }
}
