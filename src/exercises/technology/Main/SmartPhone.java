package exercises.technology.Main;

public class SmartPhone extends Computer {
    private boolean hasNumber;

    public SmartPhone ( Integer Id, String os, String processor, boolean hasKeyboard, boolean hasNumber ) {
        super(Id, os, processor, hasKeyboard);
        this.hasNumber = hasNumber;
    }
}

