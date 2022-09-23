public class ExerciseBookMonogram {
    public static void main(String[] args) {
        String firstName = IBIO.input("Enter your first name: ");
        String lastName = IBIO.input("Enter your last name: ");
        String middleName = IBIO.input("Enter your middle initial: ");

        System.out.println(firstName.toLowerCase().substring(0, 1) + lastName.toUpperCase().substring(0, 1) + middleName.toLowerCase().substring(0, 1));
    }
}
