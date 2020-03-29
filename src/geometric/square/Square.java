package geometric.square;

import geometric.Geometric;

public class Square extends Geometric {
    private double side;

    public Square() {
        side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super.setColor(color);
        super.setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
        return "A square with side = "
                + side
                + ", which is a subclass of "
                + super.toString();
    }
}
