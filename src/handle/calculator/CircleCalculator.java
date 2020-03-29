package handle.calculator;

import geometric.circle.Circle;
import handle.io.inputData;
import handle.io.outputData;

public class CircleCalculator extends Calculator implements inputData, outputData {
    private Circle circle = new Circle();

    @Override
    public double getArea() {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return circle.getRadius() * 2 * Math.PI;
    }

    @Override
    public void inputData() {
        System.out.print("Enter radius: ");
        circle.setRadius(scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n"
                , getPerimeter()
                , getArea());
    }
}

