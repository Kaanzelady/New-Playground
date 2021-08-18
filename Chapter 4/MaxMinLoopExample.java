public class MaxMinLoopExample {
    public static void hailstoneMaxMin(int value, int length) {
        int max = value;
        int min = value;

        for (int i = 1; i <= length - 1; i++) {
            if (value % 2 == 0) {
                value = value / 2;
            } else {
                value = 3 * value + 1;
            }
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static void main(String[] args) {
        hailstoneMaxMin(15, 20);
    }
}
