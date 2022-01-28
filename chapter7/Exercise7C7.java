import java.util.Arrays;

public class Exercise7C7 {
    public static void main(String[] args) {
        int[] list = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(kthLargest(list, 2));
    }
    public static int kthLargest(int[] a, int k) {
        int[] temps = a;
        Arrays.sort(temps);
        return temps[temps.length - 1 - k];
    }
}
