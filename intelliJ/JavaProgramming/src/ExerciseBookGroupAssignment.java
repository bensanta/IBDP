public class ExerciseBookGroupAssignment {
    public static void main(String[] args) {
        //name input
        String firstName = IBIO.input("Enter your first name: ");
        String lastName = IBIO.input("Enter your last name: ");

        //TODO: Groups
        //      1 - A -> I
        //      2 - J -> S
        //      3 - T -> Z

        //Example output - Janus Smith is assigned to Group 2

        if (lastName.toUpperCase().charAt(0) >= 'A' && lastName.toUpperCase().charAt(0) <= 'I'){
            System.out.println(firstName + " " + lastName + " is assigned to Group 1");
        } else if (lastName.toUpperCase().charAt(0) >= 'J' && lastName.toUpperCase().charAt(0) <= 'S'){
            System.out.println(firstName + " " + lastName + " is assigned to Group 2");
        } else if (lastName.toUpperCase().charAt(0) >= 'T' && lastName.toUpperCase().charAt(0) <= 'Z'){
            System.out.println(firstName + " " + lastName + " is assigned to Group 3");
        } else {
            System.out.println("Invalid last name!");
        }
    }
}
