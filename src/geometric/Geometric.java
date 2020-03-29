package geometric;

public abstract class Geometric {
    private String color;
    private boolean filled;

    protected boolean getFilled() {
        return filled;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + color
                + " and "
                + (filled ? "filled" : "not filled");
    }

    //    public Geometric() {
    //        color = "green";
    //        filled = true;
    //    }
    //
    //    public Geometric(String color, boolean filled) {
    //        this.color = color;
    //        this.filled = filled;
    //    }
}
