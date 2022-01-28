public class Exercise5C7 {
    public static void main(String[] args) {
        int[] list = {-27, 15, 15, 11, -27};
        System.out.println(mode(list));
    }
    public static int mode(int[] data) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : data) {
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }
        int result = 0;
        if (min < 0) {
            int[] count = new int[max + 1 + Math.abs(min)];
            for (int n : data) {
                count[n + Math.abs(min)]++;
            }

            int countMax = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > countMax) {
                    countMax = count[i];
                    result = i - Math.abs(min);
                }
            }
            return result;

        } else {
            int[] count = new int[max + 1];
            for (int n : data) {
                count[n]++;
            }
            
            int countMax = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > countMax) {
                    countMax = count[i];
                    result = i;
                }
            }
            return result;
        }
    }
    
}
