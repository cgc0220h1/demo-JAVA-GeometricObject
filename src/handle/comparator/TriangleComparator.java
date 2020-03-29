package handle.comparator;

import geometric.triangle.Triangle;

import java.util.Comparator;

public class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle triangle1, Triangle triangle2) {
        if (triangle1.getArea() > triangle2.getArea()) {
            return 1;
        } else if (triangle1.getArea() < triangle2.getArea()) {
            return -1;
        }
        return 0;
    }
}
