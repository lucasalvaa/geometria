package my_geometry;

public class Square {
    private Point top_left;
    private Point top_right;
    private Point bottom_left;
    private Point bottom_right;
    private boolean isValid;

    public Square (Point top_left, Point top_right, Point bottom_left, Point bottom_right) {
        this.top_left = top_left;
        this.top_right = top_right;
        this.bottom_left = bottom_left;
        this.bottom_right = bottom_right;
        this.isValid = this.areCoordsValid();
    }

    public double getSideLength () {
        return this.isValid
            ? this.top_left.getDistanceFrom(top_right)
            : 0.f;
    }

    public double getPerimeter () {
        return this.getSideLength() * 4.f;
    }

    public double getArea () {
        return MyMath.square(this.getSideLength());
    }

    @Override
    public String toString () {
        if (this.isValid) {
            return "This is a valid square. {TopLeft" + this.top_left.toString() +
                ", TopRight" + this.top_right.toString() +
                ", BottomLeft" + this.bottom_left.toString() + 
                ", BottomRight" + this.bottom_right.toString() + 
                "}.\nSide length: " + this.getSideLength() +
                ", Perimeter: " + this.getPerimeter() +
                ", Area: " + this.getArea();
        }
        else {
            return "This is not a valid square. Try to edit its coords.";
        }
    }
    
    private boolean areCoordsValid () {
        return (this.top_left.getX() == this.bottom_left.getX()) 
            && (this.top_right.getX() == this.bottom_right.getX()) 
            && (this.top_left.getY() == this.top_right.getY())
            && (this.bottom_left.getY() == this.bottom_right.getY());
    }
}