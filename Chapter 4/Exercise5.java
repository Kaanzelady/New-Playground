public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(pow(3, 0));
        System.out.println(pow(3, 3));
    }

    public static int pow(int base,int power) {
        int result = 1;

        if (power < 0) {
            throw new IllegalArgumentException();
        } else if (power == 0) {
            return result;
        }


        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
