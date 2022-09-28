import java.util.Random;

public class Testing {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        System.out.println(rnd.nextInt(1,11));


//        String name = IBIO.inputString("Please enter your name: ");
//        System.out.print(name.substring(name.length()-1, name.length()));
//        System.out.print(name.substring(name.length()-2, name.length()-1));
//        System.out.print(name.substring(name.length()-3, name.length()-2));
//        System.out.print(name.substring(name.length()-4, name.length()-3));
//        System.out.print(name.substring(name.length()-5, name.length()-4));
//        System.out.print(name.substring(name.length()-6, name.length()-5));
//        System.out.print(name.substring(name.length()-7, name.length()-6));
//
//        System.out.print("\n");
//        System.out.println();
        String name = IBIO.input("Please enter your name: ");

        int i = 0;
        int beginIndexSubtract = 1;
        int endIndexSubtract = 0;

        while (i < name.length()){
            System.out.print(name.charAt(name.length()-1-i));
            beginIndexSubtract++;
            endIndexSubtract++;
            i++;
        }
    }
}
