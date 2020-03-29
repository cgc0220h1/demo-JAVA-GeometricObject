package testcase;

import geometric.Geometric;
import geometric.triangle.Triangle;

public class TriangleTest extends TestCase {
    @Override
    public void displayCase() {
        //Test class geometric.triangle.Triangle
        Geometric triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        triangle = new Triangle("pink", false, 3, 4, 5);
        System.out.println(triangle);
        System.out.println();
    }
}
