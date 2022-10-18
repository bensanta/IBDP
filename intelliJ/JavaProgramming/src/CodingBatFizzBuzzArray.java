public class CodingBatFizzBuzzArray {
    public static void main(String[] args) {
        fizzBuzz(1, 6);
    }
    public static String[] fizzBuzz(int start, int end) {

        String[] fizzBuzz = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzz[i - start] = "Buzz";
            } else {
                fizzBuzz[i - start] = String.valueOf(i);
            }
        }
        return fizzBuzz;
    }

}

