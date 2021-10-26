public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(season(13, 17));
    }

    // pre: month between 1 and 12, day between 1 and 31;
    // post: returns name of that season;
    public static String season(int m, int d) {
        if ((1 <= m && m <= 12) && (1 <= d && d <= 31)) {
            if (m < 3 || (m == 12 && d >= 16) || (m == 3 && d <= 15)) {
                return "winter";
            } else if ((3 < m && m < 6) || (m == 3 && 16 <= d) || (m == 6 && d <= 15)) {
                return "spring";
            } else if ((6 < m && m < 9) || (m == 6 && 16 <= d) || (m == 9 && d <= 15)) {
                return "summer";
            } else {
                return "fall";
            }

        } else {
            throw new IllegalArgumentException("Not a real date");
        }
    }
}
