public class W3ResConditionalStatement9 {
    public static void main(String[] args) {
        //TODO: Write a Java program that takes a year from user and print whether that year is a leap year or not.
        int year = IBIO.inputInt("Input a year: ");
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
