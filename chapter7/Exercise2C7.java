public class Exercise2C7 {
    public static void main(String[] args) {
        int[] list = {22};
        System.out.println(range(list));
    }
    public static int range(int[] data) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : data) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min + 1;
    }
}
