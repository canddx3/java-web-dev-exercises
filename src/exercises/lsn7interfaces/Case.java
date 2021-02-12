package exercises.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Case {
    private final ArrayList<Flavor> flavors = new ArrayList<>();
    private final ArrayList<Cone> cones = new ArrayList<>();

    public Case(){
        Cone cone1 = new Cone("Waffle", 1.25, new ArrayList<>(Collections.singletonList("gluten")));
        Cone cone2 = new Cone("Sugar", 0.75, new ArrayList<>(Collections.singletonList("gluten")));
        Cone cone3 = new Cone("Wafer", 0.50, new ArrayList<>(Collections.singletonList("gluten")));
        Cone cone4 = new Cone("Bowl", 0.05, new ArrayList<>(Collections.singletonList("none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.75, new ArrayList<>(Collections.singletonList("dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.75, new ArrayList<>(Collections.singletonList("dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Collections.singletonList("strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

}
