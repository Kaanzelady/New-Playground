public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(pow(3, 0));
    }

    public static int pow(int base,int power) {
        if (power < 0) {
            throw new IllegalArgumentException();
        } else if (power == 0) {
            return 1;
        }

        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
