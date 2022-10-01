public class ExerciseBookCountVowels {
    public static void main(String[] args) {
        String input = IBIO.input("Enter text: ");
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
                input.charAt(i) == 'o' || input.charAt(i) == 'u' ||
                input.charAt(i) == 'i'){
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
    }
}
