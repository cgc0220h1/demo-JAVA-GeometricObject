package handle.calculator;

import geometric.circle.Circle;
import io.inputData;
import io.outputData;

public class CircleCalculator extends Calculator implements inputData, outputData {
    private Circle circle = new Circle();
    private static final int COEFFICIENT = 2;
    private static final double PI = Math.PI;

    @Override
    public double getArea() {
        return Math.pow(circle.getRadius(), COEFFICIENT) * PI;
    }

    @Override
    public double getPerimeter() {
        return circle.getRadius() * COEFFICIENT * PI;
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

