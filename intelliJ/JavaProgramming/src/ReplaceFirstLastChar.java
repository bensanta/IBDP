public class ReplaceFirstLastChar {
    public static void main(String[] args) {
        //TODO: Construct an algorithm to accept a string and output a string with replaced first and last characters.
        // Input: Hungary
        // Output: yungarH
        String input = IBIO.input("Please enter a String: ");
        String output = input.substring(input.length()-1) + input.substring(1, input.length()-1) + input.substring(0,1);
        System.out.println(output);
    }
}
