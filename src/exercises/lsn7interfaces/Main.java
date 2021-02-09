package exercises.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

//      FLavors
        System.out.println("Before: " + "\n");
        for (Flavor before : flavors)
            System.out.println(before.getName());
        System.out.println("\n" + "After: " + "\n");
        flavors.sort(new FlavorComp());
        for (Flavor after : flavors)
            System.out.println(after.getName());


//      Cones
        System.out.println("\n" + "Before: " + "\n");
        for (Cone before : cones)
            System.out.println(before.getName() + ": $" + before.getCost());
        System.out.println("\n" + "After: " + "\n");
        cones.sort(new ConeComp());
        for (Cone after : cones)
            System.out.println(after.getName() +": $" + after.getCost());

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
