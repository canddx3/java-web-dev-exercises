package exercises.lsn7interfaces;

import java.util.Comparator;

public class AllergenComp implements Comparator<Flavor> {
    @Override
    public int compare ( Flavor o1, Flavor o2 ) {
        return o1.getAllergens().size() - o2.getAllergens().size();
    }
}
