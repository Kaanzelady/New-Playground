public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    public Line(int x1, int y1, int x2, int y2) {
        Point p1Temp = new Point(x1, y1);
        Point p2Temp = new Point(x2, y2);

        this.p1 = p1Temp;
        this.p2 = p2Temp;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public String toString() {
        return "[(" + p1.getX() + ", " + p1.getY() + "), (" +
                 p2.getX() + ", " + p2.getY() + ")]";
    }

    public double getSlope() {
        if (p1.getX() == p2.getX()) {
            throw new IllegalArgumentException();
        }
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }
}
