package exercises.technology.Main;

public class Laptop extends Computer {
    private boolean hasTrackpad;

    public Laptop ( Integer Id, String os, String processor, boolean hasKeyboard, boolean hasTrackpad ) {
        super(Id, os, processor, hasKeyboard);
        this.hasTrackpad = hasTrackpad;
    }
}

