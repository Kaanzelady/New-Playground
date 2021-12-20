public class Exercise2C5 {
    public static void main(String[] args) {
        int n = gcd(54, 90);
        int i = gcd(45, 65);
        System.out.println(i + "," + n);
    }
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
