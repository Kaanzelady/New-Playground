public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(pow2(-4.0, -1));
    }

    public static double pow2(double base,int exp) {
        double result = 1;
        
        for (int i = 0; i < Math.abs(exp); i++) {
            result *= base;
        }

        if (exp < 0) {
            return 1.0 / result;
        }
        
        return result;
    }   
}
