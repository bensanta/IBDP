public class ExerciseBookGuessingGameModified {
    public static void main(String[] args) {

        int computerNumber = (int)(Math.random() * 20) + 1;
        int userGuess;
        do {
            userGuess = IBIO.inputInt("Guess a number between 1 and 20: ");
            if (userGuess >= 1 && userGuess <= 20) {
                if (userGuess == computerNumber) {
                    System.out.println("You got it!");
                } else {
                    System.out.println("Not quite right, try again!");
                }
            } else {
                System.out.println("Invalid number! Enter a value between 1 and 20!");
            }
        } while (userGuess != computerNumber);
    }
}
