package studios.disc;

import java.util.ArrayList;

public class DVD extends BaseClass implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public DVD ( String name, double availableSpace, double totalSpace, double usedSpace, ArrayList<String> contents, String discType ) {
        super(name, availableSpace, totalSpace, usedSpace, contents, discType);
    }

    @Override
    public void spinDisc () {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void read () {
        System.out.println("Name: " + getName() + " contents: " + getContents() + " disc type: " + getDiscType());
    }


}
