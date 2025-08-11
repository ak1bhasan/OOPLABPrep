
package com.mycompany.mucar;


public class ElectricCar extends Car {
    private double batteryRange;

    public ElectricCar(double batteryRange, String regNumber, String model, double speed) {
        super(regNumber, model, speed);
        this.batteryRange = batteryRange;
    }

    public double getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(double batteryRange) {
        this.batteryRange = batteryRange;
    }

    @Override
    public void carInfo() {
        super.carInfo();
        System.out.println("Battery range of the car: " + batteryRange);
    }

}
