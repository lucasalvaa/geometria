package my_geometry;

public class Circle {
    private Point center;
    private double radius;

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    public double getArea () {
        return Math.PI * MyMath.square(radius);
    }

    public double getDiameter () {
        return 2 * radius;
    }

    public double getRadius () {
        return this.radius;
    }

    public void extendsRadius (double increment) {
        this.radius += increment;
    }

    @Override
    public String toString () {
        return "Center: " + center.toString() +
                ", Radius: " + radius +
                ", Diameter: " + this.getDiameter() +
                ", Perimeter: " + this.getPerimeter() +
                ", Area: " + this.getArea();
    }
}