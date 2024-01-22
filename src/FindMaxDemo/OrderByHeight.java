package FindMaxDemo;

import java.util.Comparator;

public class OrderByHeight implements Comparator<Triangle> {
    public int compare(Triangle t1, Triangle t2) {
        return (int) (t1.getHeight() - t2.getHeight());
    }
}
