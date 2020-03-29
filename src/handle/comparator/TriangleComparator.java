package handle.comparator;

import geometric.triangle.Triangle;
import handle.calculator.TriangleCalculator;

import java.util.Comparator;

public class TriangleComparator implements Comparator<TriangleCalculator> {
    @Override
    public int compare(TriangleCalculator triangle1, TriangleCalculator triangle2) {
        if (triangle1.getArea() > triangle2.getArea()) {
            return 1;
        } else if (triangle1.getArea() < triangle2.getArea()) {
            return -1;
        }
        return 0;
    }
}
