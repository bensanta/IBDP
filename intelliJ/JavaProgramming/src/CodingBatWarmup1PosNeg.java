public class CodingBatWarmup1PosNeg {
    public static void main(String[] args) {
        posNeg(-1, 5, false);
        posNeg(1, -5, false);
        posNeg(-1, -5, true);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}

