public class Exercise3C7 {
    public static void main(String[] args) {
        int[] list = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(list, 4, 17));
    }
    public static int countInRange(int[] data, int min, int max) {
        int count = 0;
        for (int n : data) {
            if (min <= n && n <= max) {
                count++;
            }
        }
        return count;
    }
}
