package handle.editor.colorable;

import geometric.square.Square;

public class SquareColorable implements Colorable<Square> {
    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
