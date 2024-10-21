import my_geometry.*;

public class Main {

    public static void main (String argv[]) {
        // Points

        Point p1 = new Point (2, 4);
        Point p2 = new Point (5, 6);
        Point p3 = new Point (3, 4);

        System.out.println("p1: " + p1.toString() + ", p2: " + p2.toString() + ", p3: " + p3.toString());
        System.out.println("Distance between p1 and p2: " + p1.getDistanceFrom(p2));
        System.out.println("Distance between p1 and p3: " + p1.getDistanceFrom(p3));
        System.out.println("Distance between p2 and p3: " + p2.getDistanceFrom(p3));

        double slope = p1.getSlopeWith(p2);
        System.out.println("Slope between p1 and p2: " + slope);
        String check = p3.isAlignedWith(p1, p2) ? "" : "not ";
        System.out.println("p3 is " + check + "aligned to p1 and p2");
        System.out.println("-----------------------------------------------------------------");
        
        // Triangles
        Point t1 = new Point (1, 5);
        Point t2 = new Point (1, 1);
        Point t3 = new Point (4, 1);
        Point tf = new Point (1, 7);

        Triangle valid_t = new Triangle (t1, t2, t3);
        Triangle invalid_t = new Triangle (t1, t2, tf);

        System.out.println(valid_t.toString());
        System.out.println(invalid_t.toString());
        System.out.println("-----------------------------------------------------------------");
        
        // Circle
        Point center = p1.getAveragePointWith(p3);
        Circle circle = new Circle (center, 3.5);
        // Another way to initialize a circle
        // Circle circle = new Circle(new Point(6,7), 5);
        System.out.println(circle.toString());
        System.out.println("-----------------------------------------------------------------");

        // Square
        Point tl = new Point (0, 5);
        Point tr = new Point (5, 5);
        Point bl = new Point (0, 0);
        Point br = new Point (5, 0);

        Square valid_s = new Square (tl, tr, bl, br);
        Square invalid_s = new Square (tl, tr, bl, new Point(0, 15));
        
        System.out.println(valid_s.toString());
        System.out.println(invalid_s.toString());

    }
}