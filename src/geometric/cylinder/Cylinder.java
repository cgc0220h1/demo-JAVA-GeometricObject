package geometric.cylinder;
import geometric.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + height
                + " and radius = "
                + super.getRadius()
                + "\n"
                + "Which is a subclass of "
                + super.toString();
    }
}
