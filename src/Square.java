public class Square extends Geometric {
    private double side;
    private static final int COEFFICIENT = 4;

    public Square() {
        side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public boolean getFilled() {
        return super.getFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A square with side ="
                + side
                + ", which is a subclass of "
                + super.toString();
    }
}
