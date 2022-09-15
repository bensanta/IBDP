public class ExerciseBookProject {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes spend on each of the following project tasks: ");

        int designing = IBIO.inputInt("Designing: ");
        int coding = IBIO.inputInt("Coding: ");
        int debugging = IBIO.inputInt("Debugging: ");
        int testing = IBIO.inputInt("Testing: ");

        //total
        int total = designing + coding + debugging + testing;

        //percentage
        double designingPercent = (double)designing/total*100;
        double codingPercent = (double)coding/total*100;
        double debuggingPercent = (double)debugging/total*100;
        double testingPercent = (double)testing/total*100;

        //output to user
        System.out.println("TASK + %TIME SPENT");
        System.out.println("Designing: " + designingPercent + "%");
        System.out.println("Coding: " + codingPercent + "%");
        System.out.println("Debugging: " + debuggingPercent + "%");
        System.out.println("Testing: " + testingPercent + "%");
    }
}
