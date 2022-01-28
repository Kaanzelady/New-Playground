public class Exercise1C7 {
    public static void main(String[] args) {
        int[] data = {74, 85, -175, 99, 101, 85, 56};
        int result = lastIndexOf(data, -175);
        System.out.println(result);
    }
    public static int lastIndexOf(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                int result = Math.abs(value);
                if (result >= 10) {
                    result = result % 10;
                }
                return result;
            }
        }
        return -1;
    }
}
