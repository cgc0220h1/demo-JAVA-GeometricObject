package handle.editor.resizeable;

import geometric.square.Square;

public class SquareResizeable implements Resizeable<Square> {
    private double percent;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(Square square) {
        square.setSide(square.getSide() * percent);
    }
}
