public class BooleanZen {
    public static void main(String[] args) {
        negative(-2.0);
        negative2(2.0);
    }
    public static boolean isTwoUniqueDigits(int n) {
        return (n >= 10 && n <= 99 && (n % 10 != n / 10));
    }
    public static void negative(double n) {
        boolean negative = (n < 0);
        if (negative) {
            System.out.println("negative");
        } else {
            System.out.println("non-negative");
        }
    }
    public static boolean negative2(double n) {
        boolean negative = (n < 0);
        if (!negative) {
            System.out.println("non-negative");
        } else {
            System.out.println("negative");
        }
        return negative;
    }
}
