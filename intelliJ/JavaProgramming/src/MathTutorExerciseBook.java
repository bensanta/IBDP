import java.util.Random;
public class MathTutorExerciseBook {
    public static void main(String[] args) {
        //generating 2 random digits
        int randomInt1 = (int)Math.floor(Math.random()*(10-0+1)+0);
        int randomInt2 = (int)Math.floor(Math.random()*(10-0+1)+0);
        //determining the operator to use
        int operatorValue = (int)Math.floor(Math.random()*(4-1+1)+1);

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

