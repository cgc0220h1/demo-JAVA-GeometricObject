package handle.comparator;

import geometric.cylinder.Cylinder;

import java.util.Comparator;

public class CylinderComparator implements Comparator<Cylinder> {
    @Override
    public int compare(Cylinder cylinder1, Cylinder cylinder2) {
        if (cylinder1.getVolume() > cylinder2.getVolume()) {
            return 1;
        } else if (cylinder1.getVolume() < cylinder2.getVolume()) {
            return -1;
        }
        return 0;
    }
}
