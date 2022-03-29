public class PointMain {
    public static void main(String[] args) {
        Point p = new Point(3, -5);

        System.out.println("distance from origin = " 
        + p.getDistanceFromOrigin());

        p.flip();
        
        System.out.println(p);

        Point pt = new Point(2, 3);
        Point p2 = new Point(-1, 9);
        System.out.println(Point.roundAvoid(1.43256, 3));
        System.out.println(p.manhattanDistance(pt));

        System.out.println(p.isVertical(pt));
        
        System.out.println(p.slope(pt));

        System.out.println(p.isCollinear(pt, p2));
    }
}
