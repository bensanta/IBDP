public class CodingBatWarmup1SleepIn {
    public static void main(String[] args) {
        //TO-DO: The parameter weekday is true if it is a weekday, and the parameter
        // vacation is true if we are on vacation. We sleep in if it is not a weekday,
        // or we're on vacation. Return true if we sleep in.
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday || !vacation){
            return false;
        } else {
            return true;
        }
    }
}
