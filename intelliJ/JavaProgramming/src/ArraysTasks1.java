public class ArraysTasks1 {
    public static void main(String[] args) {
        //TODO: Create an array of 5 Strings, accept values from the keyboard and populate the array.
        String input;
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = IBIO.input("Input here");
        }
    }
}
