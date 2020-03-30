package testcase;

import geometric.Geometric;
import geometric.circle.Circle;
import geometric.square.Square;
import handle.comparator.SquareComparator;
import handle.editor.resizeable.CircleResizeable;
import handle.editor.resizeable.SquareResizeable;

import java.util.Arrays;

public class SquareTest {
    public static void main(String[] args) {
        //Test class geometric.square.Square
        Geometric squareObject = new Square();
        System.out.println(squareObject);
        squareObject = new Square(2.3);
        System.out.println(squareObject);
        squareObject = new Square("yellow", true, 5.8);
        System.out.println(squareObject);
        System.out.println();

        //Test class Square Comparator
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(9);
        squares[2] = new Square("yellow", true, 5.8);

        System.out.println("Pre-sorted: ");
        for (Square square : squares) {
            System.out.println(square);
        }

        SquareComparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted: ");
        for (Square square : squares) {
            System.out.println(square);
        }

        //Test resizeable
        System.out.println("Test Resizeable");
        squares = new Square[100];
        for (int index = 0; index < squares.length; index++) {
            squares[index] = new Square();
        }

        SquareResizeable squareResizeable = new SquareResizeable();
        for (Square square : squares) {
            squareResizeable.setPercent(Math.random() + 1);
            squareResizeable.resize(square);
            System.out.println(square);
        }
    }
}
