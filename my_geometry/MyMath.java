package my_geometry;

public class MyMath {

    public static double square (double value) {
        return value * value;
    }

    public static int abs (int value) {
        return value < 0 ? value * -1 : value;
    }

    public static double fabs (double value) {
        return value < 0 ? value * -1 : value;
    }

}