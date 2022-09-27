public class ExcerciseBookTimeConversion {
    public static void main(String[] args) {
        int timeInput = IBIO.inputInt("Enter the # of min: ");
        int hoursInInput = timeInput / 60;

        int remainingMinutes = timeInput % 60;
        System.out.println("The time is: " + hoursInInput + ":" + remainingMinutes);
    }
}
