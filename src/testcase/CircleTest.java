package testcase;

import geometric.Geometric;
import geometric.circle.Circle;
import handle.comparator.CircleComparator;

import java.util.Arrays;

public class CircleTest {
    public static void main (String[] args) {
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
        circles[2] = new Circle("indigo",false,3.5);

        System.out.println("Pre-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circleObject);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    public void displayResizeable() {

    }

    public void displayColorable() {

    }
}
