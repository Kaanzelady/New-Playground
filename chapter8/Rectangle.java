public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Point p, int width, int height) {
        this(p.getX(), p.getY(), width, height);
    }

    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y +
         ",width=" + width + ",height=" + height + "]";
    }

    public boolean contains(int x, int y) {
        return (x >= this.x && x <= this.x + width &&
        y <= this.y && y >= this.y - height);
    }
    public boolean contains(Point p) {
        return contains(p.getX(), p.getY());
    }


}
