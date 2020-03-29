package handle.calculator;

import geometric.square.Square;
import handle.io.inputData;
import handle.io.outputData;

public class SquareCalculator extends Calculator implements inputData, outputData {
    Square square = new Square();

    @Override
    public double getArea() {
        return Math.pow(square.getSide(), 2);
    }

    @Override
    public double getPerimeter() {
        return square.getSide() * 4;
    }

    @Override
    public void inputData() {
        System.out.print("Enter side: ");
        square.setSide(scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n"
                ,getPerimeter()
                ,getArea());
    }
}
