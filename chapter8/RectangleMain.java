public class RectangleMain {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Rectangle rec1 = new Rectangle(p, 3, 4);
        Point p2 = new Point(3, 3);
        Rectangle rec2 = new Rectangle(p2, 2, 2);

        System.out.println(rec2);
        System.out.println(rec1.contains(3, 0));
        System.out.println(rec1.contains(p2));

    }
}
