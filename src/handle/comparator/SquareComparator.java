package handle.comparator;

import geometric.square.Square;
import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {
        if (square1.getSide() > square2.getSide()) {
            return 1;
        } else if (square1.getSide() < square2.getSide()) {
            return -1;
        }
        return 0;
    }
}
