package testcase;

import geometric.Geometric;
import geometric.circle.Circle;
import geometric.cylinder.Cylinder;
import handle.comparator.CylinderComparator;
import handle.editor.resizeable.CircleResizeable;
import handle.editor.resizeable.CylinderResizeable;

import java.util.Arrays;

public class CylinderTest {
    public static void main(String[] args) {
        //Test class Cylinder
        Geometric cylinderObject = new Cylinder();
        System.out.println(cylinderObject);
        cylinderObject = new Cylinder(8);
        System.out.println(cylinderObject);
        cylinderObject = new Cylinder(3.6, 10);
        System.out.println(cylinderObject);
        cylinderObject = new Cylinder("black", true, 2.1, 20);
        System.out.println(cylinderObject);
        System.out.println();

        //Test class Cylinder Comparator
        Cylinder[] cylinders = new Cylinder[3];
        cylinders[0] = new Cylinder(8);
        cylinders[1] = new Cylinder(3.6, 10);
        cylinders[2] = new Cylinder("black", true, 2.1, 20);

        System.out.println("Pre-sorted:");
        for (Cylinder cylinder : cylinders) {
            System.out.println(cylinder);
        }

        CylinderComparator cylinderComparator = new CylinderComparator();
        Arrays.sort(cylinders, cylinderComparator);

        System.out.println("After-sorted:");
        for (Cylinder cylinder : cylinders) {
            System.out.println(cylinder);
        }

        //Test resizeable
        System.out.println("Test Resizeable");
        cylinders = new Cylinder[100];
        for (int index = 0; index < cylinders.length; index++) {
            cylinders[index] = new Cylinder();
        }

        CylinderResizeable cylinderResizeable = new CylinderResizeable();
        for (Cylinder cylinder : cylinders) {
            cylinderResizeable.setPercent(Math.random() + 1);
            cylinderResizeable.resize(cylinder);
            System.out.println(cylinder);
        }
    }
}
