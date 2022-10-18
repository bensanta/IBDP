public class EmailChecker {
    public static void main(String[] args) {
//TODO:   Construct an algorithm to validate an e-mail address.
//        1.e-mail address should contain “@” AND
//        2.e-mail address should contain “.” AND
//        3.”@” comes before “.”
//        4.there should be 3 characters after the “.”

        String email = IBIO.input("Enter your e-mail address: ");
        int locOfAt = email.indexOf("@");
        int locOfPeriod = email.lastIndexOf("."); //lastIndexOf() is used, so that an email such as "Ben.Santa@pm.me" is still valid

        if (locOfAt >= 0 && locOfPeriod >= 0 && locOfAt < locOfPeriod && email.length() - locOfPeriod == 4){
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}
