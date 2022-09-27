public class ExerciseBookPowersTable {
    public static void main(String[] args) {
        //TODO: ASK FOR A HINT
        int x = 1;
        //System.out.print("x^1       x^2         x^3         x^4         x^5");
        while (x <= 6) {
            System.out.print("x^" + x + "      ");
            x++;
        }
        System.out.println("");
        int y = 1;
        while (y <= 6){
            System.out.println(1 * y * x + "        ");
            y++;
        }
    }
}
