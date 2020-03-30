package handle.editor.resizeable;

import geometric.triangle.Triangle;

public class TriangleResizeable implements Resizeable<Triangle> {
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(Triangle triangle) {
        triangle.setSide1(triangle.getSide1() * percent);
        triangle.setSide2(triangle.getSide2() * percent);
        triangle.setSide3(triangle.getSide2() * percent);
    }
}
