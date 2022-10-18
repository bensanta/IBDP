public class ArraysTasks2 {
    public static void main(String[] args) {
        //TODO: For the given array of 5 integers, print out all values greater than 10
        int input;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = IBIO.inputInt("Enter num: ");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 10){
                System.out.println(array[i]);
            }
        }
    }
}
