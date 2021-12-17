public class ThrowingExceptions {
    public static void main(String[] args) {
        for (int i = -1; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
    //pre: n >= 0
    //post: returns n factorial (n!)
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: "+ n);
        }
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
