import java.util.Random;
public class ExerciseBookMathTutor {
    public static void main(String[] args) {
        //generating 2 random digits
        Random rnd = new Random ();
        int randomInt1 = rnd.nextInt(11);
        int randomInt2 = rnd.nextInt(11);
        //determining the operator to use
        int operatorValue = rnd.nextInt(1, 5);

        if (operatorValue == 1){ //Addition +
            int userAnswer = IBIO.inputInt("What is " + randomInt1 + " + " + randomInt2 + " ?\n");
            if (userAnswer == randomInt1 + randomInt2){
                System.out.println("Correct :)");
            } else{
                System.out.println("Incorrect :(");
            }
        }
        else if (operatorValue == 2){ //Subtraction -
            int userAnswer = IBIO.inputInt("What is " + randomInt1 + " - " + randomInt2 + " ?\n");
            if (userAnswer == randomInt1 - randomInt2){
                System.out.println("Correct :)");
            } else{
                System.out.println("Incorrect :(");
            }
        }
        else if (operatorValue == 3){ //Multiplication *
            int userAnswer = IBIO.inputInt("What is " + randomInt1 + " * " + randomInt2 + " ?\n");
            if (userAnswer == randomInt1 * randomInt2){
                System.out.println("Correct :)");
            } else{
                System.out.println("Incorrect :(");
            }
        }
        else if (operatorValue == 4){ //Division /
            int userAnswer = IBIO.inputInt("What is " + randomInt1 + " / " + randomInt2 + " ?\n");
            if (userAnswer == randomInt1 / randomInt2){
                System.out.println("Correct :)");
            } else{
                System.out.println("Incorrect :(");
            }
        }
    }
}

