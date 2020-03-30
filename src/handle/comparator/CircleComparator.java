package handle.comparator;

import geometric.circle.Circle;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2) {
        if (circle1.getRadius() > circle2.getRadius()) {
            return 1;
        } else if (circle1.getRadius() < circle2.getRadius()) {
            return -1;
        }
        return 0;
    }
}