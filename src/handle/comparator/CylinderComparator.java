package handle.comparator;

import geometric.cylinder.Cylinder;
import java.util.Comparator;

public class CylinderComparator implements Comparator<Cylinder> {
    @Override
    public int compare(Cylinder cylinder1, Cylinder cylinder2) {
        double volume1 = Math.pow(cylinder1.getRadius(), 2) * cylinder1.getHeight();
        double volume2 = Math.pow(cylinder2.getRadius(), 2) * cylinder2.getHeight();
        if (volume1 > volume2) {
            return 1;
        } else if (volume1 < volume2) {
            return -1;
        }
        return 0;
    }
}
