package Studios.Disc;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseClass {

    private String name;
    private double availableSpace;
    private double newSpace;
    private double usedSpace;
    private List<String> contents;
    private String discType;

    public BaseClass ( String name, double availableSpace, double newSpace, double usedSpace, List<String> contents, String discType) {
        this.name = name;
        this.availableSpace = availableSpace;
        this.newSpace = newSpace;
        this.usedSpace = usedSpace;
        this.contents = contents;
        this.discType = discType;
    }

    public void write(double newSpace, double totalSpace) {
        availableSpace = totalSpace - newSpace;
        if (availableSpace > newSpace) {
            setUsedSpace(usedSpace += newSpace);
            setAvailableSpace(availableSpace -= newSpace);
            System.out.println("Success it burned");
        } else {
            System.out.println("bad");
        }
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getAvailableSpace () {
        return availableSpace;
    }

    public void setAvailableSpace ( double availableSpace ) {
        this.availableSpace = availableSpace;
    }

    public double getNewSpace () {
        return newSpace;
    }

    public void setNewSpace ( double newSpace ) {
        this.newSpace = newSpace;
    }

    public double getUsedSpace () {
        return usedSpace;
    }

    public void setUsedSpace ( double usedSpace ) {
        this.usedSpace = usedSpace;
    }

    public List<String> getContents () {
        return contents;
    }

    public void setContents ( List<String> contents) {
        this.contents = contents;
    }

    public String getDiscType () {
        return discType;
    }

    public void setDiscType ( String discType ) {
        this.discType = discType;
    }
}
