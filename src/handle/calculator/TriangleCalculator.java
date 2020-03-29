package handle.calculator;

import geometric.triangle.Triangle;
import handle.io.inputData;
import handle.io.outputData;

public class TriangleCalculator extends Calculator implements inputData, outputData {
    Triangle triangle = new Triangle();

    @Override
    public double getPerimeter() {
        return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - triangle.getSide1())
                * (halfPerimeter - triangle.getSide2())
                * (halfPerimeter - triangle.getSide3()));
    }

    @Override
    public void inputData() {
        System.out.print("Enter side 1: ");
        triangle.setSide1(scanner.nextDouble());
        System.out.print("Enter side 2: ");
        triangle.setSide2(scanner.nextDouble());
        System.out.print("Enter side 3: ");
        triangle.setSide3(scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Perimeter: %.2f - Area: %.2f \n \n"
                , getPerimeter()
                , getArea());
    }

}
