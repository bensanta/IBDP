public class WhileLessonActivity2 {
    public static void main(String[] args) {
        //TODO: Print out the following sequence of numbers: 1,4,9,16,25,36,49,64,81,100 using DO…WHILE and WHILE loops
        System.out.println("Do... While:");
        int i = 1;
        do {
            System.out.println(i * i);
            i++;
        } while (i <= 10);

        System.out.println("While:");
        int j = 1;
        while (j <= 10){
            System.out.println(j * j);
            j++;
        }
    }
}
