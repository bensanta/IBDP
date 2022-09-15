import java.util.*;
public class ExerciseBookSleep {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(); //using calendar to be able to get the current date w/o needing user input

        System.out.println("Enter your birthdate: ");
        int birthYear = IBIO.inputInt("Year: ");
        int birthMonth = IBIO.inputInt("Month: ");
        int birthDay = IBIO.inputInt("Day: ");
        System.out.println("");

        //gets and print current date - for a clearer user experience
        System.out.println("Current Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Month: " + c.get(Calendar.MONTH));
        System.out.println("Current Day: " + c.get(Calendar.DATE));

        System.out.println(""); //for tidiness

        //Conversion to days
        int yearToDays = (c.get(Calendar.YEAR)-birthYear)*365;
        int monthToDays = (c.get(Calendar.MONTH)-birthMonth)*30;
        int dayToDays = (c.get(Calendar.DATE));

        //days alive
        int totalDaysAlive = yearToDays + monthToDays + dayToDays;
        System.out.println("You have been alive for " + totalDaysAlive + " days.");
        //time spent sleeping
        int timeAsleep = totalDaysAlive * 8;
        System.out.println("You have slept " + timeAsleep + " hours.");
    }
}
