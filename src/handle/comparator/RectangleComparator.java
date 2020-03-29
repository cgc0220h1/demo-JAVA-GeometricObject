package handle.comparator;

import geometric.rectangle.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangle1, Rectangle rectangle2) {
        if (rectangle1.getArea() > rectangle2.getArea()) {
            return 1;
        } else if (rectangle1.getArea() < rectangle2.getArea()) {
            return -1;
        }
        return 0;
    }
}
