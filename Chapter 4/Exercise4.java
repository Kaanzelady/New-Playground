public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(13));
    }

    public static int daysInMonth(int m) {
        if (m < 1 || 12 < m) {
            throw new IllegalArgumentException("Not a real month!");
        } else {
            if (m == 4||m == 6||m == 9||m == 11) {
                return 30;
            } else if (m == 2) {
                return 28;
            } else {
                return 31;
            }
        }
    }
}
