public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() { return topLeft; }
    public void setTopLeft(MyPoint topLeft) { this.topLeft = topLeft; }

    public MyPoint getBottomRight() { return bottomRight; }
    public void setBottomRight(MyPoint bottomRight) { this.bottomRight = bottomRight; }

    // Methods
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toFormattedString() {
        return "Rectangle[topLeft=" + topLeft.toFormattedString() + ", bottomRight=" + bottomRight.toFormattedString() + "]";
    }
}
