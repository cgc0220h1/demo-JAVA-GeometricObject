package handle.editor.resizeable;

import geometric.rectangle.Rectangle;

public class RectangleResizeable implements Resizeable<Rectangle> {
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(Rectangle rectangle) {
        rectangle.setWidth(rectangle.getWidth() * percent);
        rectangle.setLength(rectangle.getLength() * percent);
    }
}
