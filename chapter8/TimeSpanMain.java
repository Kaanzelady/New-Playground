public class TimeSpanMain {
    public static void main(String[] args) {
        TimeSpan span1 = new TimeSpan(6, 25);
        TimeSpan span2 = new TimeSpan(1, 50);
        span1.subtract(span2);

        System.out.println(span1);
    }
}
