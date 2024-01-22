package FindMaxDemo;

import java.util.Comparator;

public class OrderByArea implements Comparator<Shape> {
    public int compare(Shape s1, Shape s2) {
        return (int) (s1.calcArea() - s2.calcArea());
    }
}
