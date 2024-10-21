package my_geometry;

public class Point {

    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }

    public void moveX (double offset) {
        this.x += offset;
    }

    public void moveY (double offset) {
        this.y += offset;
    }

    public double getDistanceFrom (Point p) {
        return Math.sqrt(MyMath.square(p.x - this.x) + MyMath.square(p.y - this.y));
    }

    public double getSlopeWith (Point p) {
        if (this.x == p.x) {
            return Double.POSITIVE_INFINITY;
        }
        return (p.y - this.y) / (p.x - this.x);
    }

    public boolean isAlignedWith (Point p1, Point p2) {
        return this.getSlopeWith(p1) == this.getSlopeWith(p2);
    }

    public Point getPointByAddingWith (Point p) {
        return new Point (this.x + p.x, this.y + p.y);
    }

    public Point getPointBySubtractingWith(Point p) {
        return new Point (this.x - p.x, this.y - p.y);
    }

    public Point getAveragePointWith (Point p) {
        return new Point ((this.x - p.x) / 2, (this.y - p.y) / 2);
    }

    public double getScalarProductWith (Point p) {
        return this.x * p.x + this.y * p.y;
    }

    @Override
    public String toString () {
        return "(" + this.x + ", " + this.y +")";
    }
 }