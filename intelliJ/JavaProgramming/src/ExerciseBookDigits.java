public class ExerciseBookDigits {
    public static void main(String[] args) {
        String num = IBIO.inputString("Enter a three-digit integer: ");
        //1st position
        int first = Integer.parseInt(num.substring(0,1));
        //2nd position
        int second = Integer.parseInt(num.substring(1,2));
        //3rd position
        int third = Integer.parseInt(num.substring(2,3));
        System.out.println("The hundreds-place digit is: " + first);
        System.out.println("The tens-place digit is: " + second);
        System.out.println("The ones-place digit is: " + third);

    }
}
