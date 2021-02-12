package exercises.lsn7interfaces;

import java.util.Comparator;

public class ConeComp implements Comparator<Cone> {

    @Override
    public int compare ( Cone o1, Cone o2 ) {
        return Double.compare(o1.getCost(), o2.getCost());
        //        return Double.compare(o1.getCost(), o2.getCost());
    }
}

