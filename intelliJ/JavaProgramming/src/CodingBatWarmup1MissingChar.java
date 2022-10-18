public class CodingBatWarmup1MissingChar {
    public static void main(String[] args) {

        System.out.println(missingChar("bennn", 0));
    }

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}

