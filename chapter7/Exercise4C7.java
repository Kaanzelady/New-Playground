public class Exercise4C7 {
    public static void main(String[] args) {
        double[] list1 = {16.1};

        if (isSorted(list1) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean isSorted(double[] data) {
        double before = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < before) {
                return false;
            }
            before = data[i];
        }
        return true;
    }
}
