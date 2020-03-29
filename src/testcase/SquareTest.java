package testcase;

import geometric.Geometric;
import geometric.square.Square;

public class SquareTest extends TestCase {
    @Override
    public void displayCase() {
        //Test class geometric.square.Square
        Geometric square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println();
    }
}
