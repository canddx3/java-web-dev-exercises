package studios.disc;

import java.util.List;

public abstract class BaseClass {

    private final String name;
    private double availableSpace;
    private final double newSpace;
    private double usedSpace;
    private final List<String> contents;
    private final String discType;

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

    public void setAvailableSpace ( double availableSpace ) {
        this.availableSpace = availableSpace;
    }

    public void setUsedSpace ( double usedSpace ) {
        this.usedSpace = usedSpace;
    }

    public List<String> getContents () {
        return contents;
    }

    public String getDiscType () {
        return discType;
    }

}
