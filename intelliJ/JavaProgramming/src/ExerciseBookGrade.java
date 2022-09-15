public class ExerciseBookGrade {
    public static void main(String[] args) {
        int percentage = IBIO.inputInt("Enter the Percentage: ");
        if (percentage<60 && percentage>-1){
            System.out.println("The corresponding letter grade is: F");
        } else if (percentage<70 && percentage>59) {
            System.out.println("The corresponding letter grade is: D");
        } else if (percentage<80 && percentage>69) {
            System.out.println("The corresponding letter grade is: C");
        } else if (percentage<90 && percentage>79) {
            System.out.println("The corresponding letter grade is: B");
        } else if (percentage<101 && percentage>89) {
            System.out.println("The corresponding letter grade is: A");
        } else {
            System.out.println("Please enter a valid percentage between 0 and 100");
        }

        }
    }
