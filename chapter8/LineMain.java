public class LineMain {
    public static void main(String[] args) {
        Point p1 = new Point(22, 3);
        Point p2 = new Point(4, 7);

        Line line = new Line(p1, p2);
        Line line2 = new Line(22, 3, 4, 5);

        System.out.println(line);
        System.out.println(line2);
    }
}
