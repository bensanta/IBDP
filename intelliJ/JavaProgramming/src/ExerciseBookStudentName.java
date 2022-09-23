public class ExerciseBookStudentName {
    public static void main(String[] args) {
        //student name input
        String firstName = IBIO.input("Enter your first name: ");
        String lastName = IBIO.input("Enter your last name: ");

        if (firstName.length() + lastName.length() > 15){
            System.out.println(firstName.charAt(0) + "." + lastName.substring(0, 4) + ".");
        } else {
            System.out.println(firstName + " " + lastName);
        }
    }
}
