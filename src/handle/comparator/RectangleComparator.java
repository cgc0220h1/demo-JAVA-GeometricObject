package handle.comparator;

import geometric.rectangle.Rectangle;
import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangle1, Rectangle rectangle2) {
        double area1 = rectangle1.getLength() * rectangle1.getWidth();
        double area2 = rectangle2.getLength() * rectangle2.getWidth();
        if (area1 > area2) {
            return 1;
        } else if (area1 < area2) {
            return -1;
        }
        return 0;
    }
}
