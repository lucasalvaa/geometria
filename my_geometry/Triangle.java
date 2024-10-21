package my_geometry;

public class Triangle {

    private Point p1, p2, p3;
    private boolean isValid;

    public Triangle (Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.isValid = this.areCoordsValid();
    }

    public boolean isValid () {
        return this.isValid;
    }

    public void setP1 (Point p1) {
        this.p1 = p1;
        this.isValid = areCoordsValid();
    }

    private void setP2 (Point p2) {
        this.p2 = p2;
        this.isValid = areCoordsValid();
    }

    private void setP3 (Point p3) {
        this.p3 = p3;
        this.isValid = areCoordsValid();
    }

    public boolean moveHorizontally (double offset) {
        if (!this.isValid) {
            return false;
        }

        this.p1.moveX(offset);
        this.p2.moveX(offset);
        this.p3.moveX(offset);
        return true;
    }

    public boolean moveVertically (double offset) {
        if (!this.isValid) {
            return false;
        }

        this.p1.moveY(offset);
        this.p2.moveY(offset);
        this.p3.moveY(offset);
        return true;
    }

    public double getPerimeter () {
        return !this.isValid
            ? 0.f 
            : p1.getDistanceFrom(p2)
                + p2.getDistanceFrom(p3)
                + p3.getDistanceFrom(p1);
    }

    public double getArea () {
        return 0.5 * MyMath.fabs(p1.getX() * (p2.getY() - p3.getY())
                + p2.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - p2.getY()));
    }

    @Override
    public String toString () {
        if (this.isValid) {
            return "This is a valid triangle: " +
                " {P1" + this.p1.toString() +
                " , P2" + this.p2.toString() +
                " , P3" + this.p3.toString() +
                "}.\nArea: " + this.getArea()+
                ", Perimeter: " + this.getPerimeter();
        }
        else {
            return "This is not a valid triangle. Try to edit its coords.";
        }
    }

    private boolean areCoordsValid () {
        return this.getArea() != 0;
    }
}