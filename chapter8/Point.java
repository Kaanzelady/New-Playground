// A Point object represents a pair of (x, y) coordinates.

public class Point {
    private int x;
    private int y;

    // constructs a new point with the given (x, y) location
    public Point() {
        this(0, 0); //calls Point(int, int) constructor
    }

    //construct a new point with given (x, y) location
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // returns the x-coordinate of this point
    public int getX() {
        return x;
    }

    // return the y-coordinate of this point 
    public int getY() {
        return y;
    }

    //set this point's (x,y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns the distance between this point and (0, 0)
    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // shifts this point’s location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    // converse this point to String
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Returns which quadrant of the x/y plane the current Point object fall in
    public int quadrant() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public void flip() {
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }

    public int manhattanDistance(Point other) {
        return Math.abs(other.x - this.x) + Math.abs(other.y - this.y);
    }

    public boolean isVertical(Point other) {
        return (other.x == this.x);
    }

    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException();
        }
        return (other.y - this.y) / (other.x - this.x);
    }
    
    public boolean isCollinear(Point p1, Point p2) {
        return roundAvoid(this.slope(p1), 4) == roundAvoid(this.slope(p2), 4);
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
