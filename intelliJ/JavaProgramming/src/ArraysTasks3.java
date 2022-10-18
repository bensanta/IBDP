public class ArraysTasks3 {
    public static void main(String[] args) {
        //TODO: For the given array of 5 integers, print out only even elements.
        int input;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = IBIO.inputInt("Input here: ");
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
