package testcase;

import geometric.Geometric;
import geometric.cylinder.Cylinder;

public class CylinderTest extends TestCase {
    @Override
    public void displayCase() {
        //Test class geometric.cylinder.Cylinder
        Geometric cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(8);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.6, 10);
        System.out.println(cylinder);
        cylinder = new Cylinder("black", true, 2.1, 20);
        System.out.println(cylinder);
        System.out.println();
    }
}
