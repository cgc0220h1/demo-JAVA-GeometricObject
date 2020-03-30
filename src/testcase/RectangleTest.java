package testcase;

import geometric.Geometric;
import geometric.circle.Circle;
import geometric.rectangle.Rectangle;
import handle.comparator.RectangleComparator;
import handle.editor.resizeable.CircleResizeable;
import handle.editor.resizeable.RectangleResizeable;

import java.util.Arrays;

public class RectangleTest {
    public static void main(String[] args) {
        //Test class Rectangle
        Geometric rectangleObject = new Rectangle();
        System.out.println(rectangleObject);
        rectangleObject = new Rectangle(2.3, 5.8);
        System.out.println(rectangleObject);
        rectangleObject = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangleObject);
        System.out.println();


        //Test class Rectangle Comparator
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(8.8,9.5);
        rectangles[2] = new Rectangle("orange",false,3,4);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        //Test resizeable
        System.out.println("Test Resizeable");
        rectangles = new Rectangle[100];
        for (int index = 0; index < rectangles.length; index++) {
            rectangles[index] = new Rectangle();
        }

        RectangleResizeable rectangleResizeable = new RectangleResizeable();
        for (Rectangle rectangle : rectangles) {
            rectangleResizeable.setPercent(Math.random() + 1);
            rectangleResizeable.resize(rectangle);
            System.out.println(rectangle);
        }
    }
}
