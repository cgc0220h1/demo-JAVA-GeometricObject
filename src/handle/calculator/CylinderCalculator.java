package handle.calculator;

import geometric.cylinder.Cylinder;
import handle.io.inputData;
import handle.io.outputData;

public class CylinderCalculator extends CircleCalculator implements inputData, outputData {
    private Cylinder cylinder = new Cylinder();

    public double getSurfaceArea() {
        return super.getPerimeter() * cylinder.getHeight();
    }

    public double getTotalArea() {
        return getSurfaceArea() + super.getArea() * 2;
    }

    public double getVolume() {
        return super.getArea() * cylinder.getHeight();
    }

    @Override
    public void inputData() {
        System.out.println("Enter Radius: ");
        cylinder.setRadius(scanner.nextDouble());
        System.out.print("Enter height: ");
        cylinder.setHeight(scanner.nextDouble());
    }

    @Override
    public void displayData() {
        System.out.printf("Surface Area: %.2f - Total Area: %.2f - Volume: %.2f \n \n"
                , getSurfaceArea()
                , getTotalArea()
                , getVolume());
    }
}
