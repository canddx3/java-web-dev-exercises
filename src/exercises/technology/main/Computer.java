package exercises.technology.main;

public class Computer extends AbstractEntity {
    private String os;
    private String processor;
    private boolean hasKeyboard;

    public Computer ( String os, String processor, boolean hasKeyboard ) {
        super();
        this.os = os;
        this.processor = processor;
        this.hasKeyboard = hasKeyboard;
    }

    public String getOs () {
        return os;
    }

    public void setOs ( String os ) {
        this.os = os;
    }

    public String getProcessor () {
        return processor;
    }

    public void setProcessor ( String processor ) {
        this.processor = processor;
    }

    public boolean isHasKeyboard () {
        return hasKeyboard;
    }

    public void setHasKeyboard ( boolean hasKeyboard ) {
        this.hasKeyboard = hasKeyboard;
    }
}
