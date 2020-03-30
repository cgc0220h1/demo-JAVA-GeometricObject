package testcase;

import geometric.Geometric;
import geometric.circle.Circle;
import handle.comparator.CircleComparator;
import handle.editor.resizeable.CircleResizeable;

import java.util.Arrays;

public class CircleTest {
    public static void main(String[] args) {
        //Test object
        Geometric circleObject = new Circle();
        System.out.println(circleObject);
        circleObject = new Circle(3.5);
        System.out.println(circleObject);
        circleObject = new Circle("indigo", false, 10);
        System.out.println(circleObject);
        System.out.println();

        //Test comparator
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        //Test resizeable
        System.out.println("Test Resizeable");
        circles = new Circle[100];
        for (int index = 0; index < circles.length; index++) {
            circles[index] = new Circle();
        }

        CircleResizeable circleResizeable = new CircleResizeable();
        for (Circle circle : circles) {
            circleResizeable.setPercent(Math.random() + 1);
            circleResizeable.resize(circle);
            System.out.println(circle);
        }
    }
}
