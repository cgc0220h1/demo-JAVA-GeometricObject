public class Main {
    public static void main(String[] args) {
        //Test class Geometric
        Geometric shape = new Geometric();
        System.out.println(shape);
        shape = new Geometric("red", false);
        System.out.println(shape);
        System.out.println();

        //Test class Circle
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 10);
        System.out.println(circle);
        System.out.println();

        //Test class Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.3, 5.8);
        System.out.println(rectangle);
        System.out.println();

        //Test class Square
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println();

        //Test class Cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(8);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.6,10);
        System.out.println(cylinder);
        cylinder = new Cylinder("black", true, 2.1,20);
        System.out.println(cylinder);
        System.out.println();

        //Test class Triangle
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        triangle = new Triangle("pink", false, 3,4,5);
        System.out.println(triangle);
        System.out.println();

    }
}
