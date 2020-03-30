package testcase;

import geometric.Geometric;
import geometric.triangle.Triangle;
import handle.editor.resizeable.TriangleResizeable;

public class TriangleTest {
    public static void main(String[] args) {
        //Test class Triangle
        Geometric triangleObject = new Triangle();
        System.out.println(triangleObject);
        triangleObject = new Triangle(3, 4, 5);
        System.out.println(triangleObject);
        triangleObject = new Triangle("pink", false, 3, 4, 5);
        System.out.println(triangleObject);
        System.out.println();

        //Test Resizeable
        System.out.println("Test resizeable");
        Triangle[] triangles = new Triangle[100];
        for(int index = 0; index < triangles.length; index++) {
            triangles[index] = new Triangle();
        }

        TriangleResizeable triangleResizeable = new TriangleResizeable();
        for (Triangle triangle : triangles) {
            triangleResizeable.setPercent(Math.random() + 1);
            triangleResizeable.resize(triangle);
            System.out.println(triangle);
        }
    }
}
