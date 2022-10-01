import java.util.Random;

public class MethodsActivityFrequencies {
    public static void main(String[] args) {
        //TODO - Roll a die 120 times, and calculate the frequency i.e. number of ones, twos, etc.
        // Display a distribution bar chart

        Random rnd = new Random();

        int rolls = 0; // To count the number of rolls

        // To store the frequency of each value
        int one = 0; int two = 0; int three = 0;
        int four = 0; int five = 0; int six = 0;

        do {
            int die = rnd.nextInt(1, 7);
            if (die == 1){
                one ++;
            } else if (die == 2){
                two ++;
            } else if (die == 3){
                three ++;
            } else if (die == 4){
                four ++;
            } else if (die == 5){
                five ++;
            } else if (die == 6){
                six ++;
            }
                rolls++;
        } while (rolls < 120);

        System.out.println("Frequency of 1: " + one);
        System.out.println("Frequency of 2: " + two);
        System.out.println("Frequency of 3: " + three);
        System.out.println("Frequency of 4: " + four);
        System.out.println("Frequency of 5: " + five);
        System.out.println("Frequency of 6: " + six);

        //Printingt the bar chart
        System.out.println("Distribution Bar Chart");

        for (int i = 0; i < one; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < two; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < three; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < four; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < five; i++){
            System.out.print("*");
        } System.out.println();

        for (int i = 0; i < six; i++){
            System.out.print("*");
        } System.out.println();
    }
}

