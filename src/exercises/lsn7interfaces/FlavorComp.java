package exercises.lsn7interfaces;

import java.util.Comparator;

public class FlavorComp implements Comparator<Flavor> {

    @Override
    public int compare ( Flavor o1, Flavor o2 ) {
        return o1.getName().compareTo(o2.getName());
    }
}
