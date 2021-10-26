

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(fractionSum(0));
    }
    public static double fractionSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        return sum;
    }    
}