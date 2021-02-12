package org.launchcode.java.demos.lsn6inheritance;

public abstract class Cat {

    private boolean tired = false;
    private boolean hungry = false;
    private final double weight;

    public Cat (double aWeight) {
        weight = aWeight;
    }
    public Cat () { weight = 13;}

    /**** Getters and Setters ****/

    public boolean isTired() {
        return tired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public double getWeight() {
        return weight;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

}
