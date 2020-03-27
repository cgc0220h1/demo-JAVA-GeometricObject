public class Geometric {
    private String color;
    private boolean filled;

    public Geometric() {
        color = "green";
        filled = true;
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + color
                + " and "
                + (filled ? "filled" : "not filled");
    }
}
