public class ExerciseBookCarRecallModified {
    public static void main(String[] args) {

        int modelNum = 1;
        while (modelNum != 0) {
            modelNum = IBIO.inputInt("Enter the car's model number or 0 to quit: ");
            if (modelNum == 119 || modelNum == 179 || modelNum == 221 || modelNum == 780 || (modelNum > 188 && modelNum < 196)) {
                System.out.println("Your car is defective! It must be repaired!");
            } else if (modelNum == 0) { // makes it so that it does not print, and stops the program in a clean way
            } else {
                System.out.println("Your car is not defective!");
            }
        }
    }
}

