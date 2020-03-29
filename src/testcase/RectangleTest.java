package testcase;

import geometric.Geometric;
import geometric.rectangle.Rectangle;

public class RectangleTest extends TestCase {
    @Override
    public void displayCase() {
        //Test class geometric.rectangle.Rectangle
        Geometric rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangle);
        System.out.println();

    }
}
