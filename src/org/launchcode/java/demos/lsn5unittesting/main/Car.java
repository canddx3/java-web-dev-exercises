package org.launchcode.java.demos.lsn5unittesting.main;

public class Car {

    private final String make;
    private final String model;
    private final int gasTankSize;
    private double gasTankLevel;
    private final double milesPerGallon;
    private double odometer = 0;

    public Car(String make, String model, int gasTankSize, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.gasTankSize = gasTankSize;
        // Gas tank level defaults to a full tank
        this.gasTankLevel = gasTankSize;
        this.milesPerGallon = milesPerGallon;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getGasTankSize() {
        return gasTankSize;
    }

    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public void setGasTankLevel(double gasTankLevel) {
        if(gasTankLevel > this.getGasTankSize()) {
            throw new IllegalArgumentException("cant exceed tank size");
        }
        this.gasTankLevel = gasTankLevel;
    }

    /**
     * Drive the car an amount of miles. If not enough fuel, drive as far as fuel allows.
     * Adjust fuel levels based on amount needed to drive the distance requested.
     * Add miles to odometer.
     *
     * @param miles - the miles to drive
     */
    public void drive(double miles)
    {
        //adjust fuel based on mpg and miles requested to drive
        double maxDistance = this.milesPerGallon * this.gasTankLevel;
        /*the double below uses some syntax called the ternary operator.
          if the value of miles is greater than the value of maxDistance,
          then milesAbleToTravel = maxDistance.
          otherwise, if miles is not greater than maxDistance,
          then milesAbleToTravel = miles
         */
        double milesAbleToTravel = Math.min(miles, maxDistance);
        double gallonsUsed = milesAbleToTravel / this.milesPerGallon;
        this.gasTankLevel = this.gasTankLevel - gallonsUsed;
        this.odometer += milesAbleToTravel;
    }

    public void addGas(double gas) {
        this.setGasTankLevel(gas + this.getGasTankLevel());
    }
}
