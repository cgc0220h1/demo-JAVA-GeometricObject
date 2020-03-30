package handle.editor.resizeable;

import geometric.cylinder.Cylinder;

public class CylinderResizeable implements Resizeable <Cylinder> {
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(Cylinder cylinder) {
        cylinder.setRadius(cylinder.getRadius() * percent);
        cylinder.setHeight(cylinder.getHeight() * percent);
    }
}
