package testcase;

import geometric.Geometric;
import geometric.circle.Circle;

public class CircleTest extends TestCase {
    @Override
    public void displayCase() {
        //Test class geometric.circle.Circle
        Geometric circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 10);
        System.out.println(circle);
        System.out.println();
    }
}
