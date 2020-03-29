import handle.calculator.*;
import handle.io.inputData;
import handle.io.outputData;
import testcase.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = null;
        int choice;
        boolean isExit = false;

        do {
            System.out.println("Calculate Area/Perimeter/Volume: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Cylinder");
            System.out.println("0. Exit program");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice != 0
                    && choice != 1
                    && choice != 2
                    && choice != 3
                    && choice != 4
                    && choice != 5) {
                System.out.println("Invalid choice! Please choose again.");
                System.out.println();
            }
            switch (choice) {
                case 1:
                    calculator = new RectangleCalculator();
                    System.out.println("1. Calculate");
                    System.out.println("2. Compare");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    calculator = new SquareCalculator();
                    System.out.println("1. Calculate");
                    System.out.println("2. Compare");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 3:
                    calculator = new TriangleCalculator();
                    System.out.println("1. Calculate");
                    System.out.println("2. Compare");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 4:
                    calculator = new CircleCalculator();
                    System.out.println("1. Calculate");
                    System.out.println("2. Compare");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 5:
                    calculator = new CylinderCalculator();
                    System.out.println("1. Calculate");
                    System.out.println("2. Compare");
                    System.out.println("Enter choice: ");
                    choice = scanner.nextInt();
                    break;
                case 0:
                    System.out.println("Exit Program!");
                    isExit = true;
            }
            switch (choice) {
                case 1:
                    ((inputData) calculator).inputData();
                    ((outputData) calculator).displayData();
                    break;
                case 2:
                    break;
            }
        } while (!isExit);
    }
}
