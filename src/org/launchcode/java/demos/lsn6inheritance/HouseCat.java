package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    public static void main ( String[] args ) {
      HouseCat garfield = new HouseCat("Garfield", 12);
      garfield.eat();
        System.out.println(garfield.isTired());
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(cheshireCat.noise());
    }

    private final String name;
    private final String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    private String noise () {
            return "Hello, my name is " + name + "!";
        }

    public String purr() {
        return "I'm a HouseCat";
    }
}
