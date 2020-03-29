package handle.calculator;

import geometric.rectangle.Rectangle;
import handle.io.inputData;
import handle.io.outputData;

public class RectangleCalculator extends Calculator implements inputData, outputData {
    private Rectangle rectangle = new Rectangle();

    @Override
    public double getArea() {
        return rectangle.getWidth() * rectangle.getLength();
    }

    @Override
    public double getPerimeter() {
        return (rectangle.getWidth() + rectangle.getLength()) * 2;
    }

    @Override
    public void inputData() {
        System.out.print("Enter width: ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.print("Enter length: ");
        rectangle.setLength(scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n"
                ,getPerimeter()
                ,getArea());
    }
}
