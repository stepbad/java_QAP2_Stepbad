public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    // Distance method
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

0    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}