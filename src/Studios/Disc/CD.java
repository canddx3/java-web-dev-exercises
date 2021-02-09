package Studios.Disc;

import java.util.ArrayList;

public class CD extends BaseClass implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD ( String name, double availableSpace, double totalSpace, double usedSpace, ArrayList<String> contents, String discType ) {
        super(name, availableSpace, totalSpace, usedSpace, contents, discType);
    }

    @Override
    public void spinDisc () {
        System.out.println("A CD spins at a rate of 200 - 500 rpm. ");
    }
    @Override
    public void read (){
        System.out.println("Name: " + getName() + " contents: " + getContents() + " disc type: " + getDiscType());
    }
}
