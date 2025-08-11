package com.mycompany.mucar;


public class Car implements speedControl {
    private String regNumber;
    private String model;
    private double speed;

    public Car(String regNumber, String model, double speed) {
        this.regNumber = regNumber;
        this.model = model;
        this.speed = speed;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public void carInfo() {
        System.out.println("Registration number of the car : " + regNumber + " & Model: " + model );
        
    }
    
    public void showSpeed() {
        System.out.println("Speed of the car: " + speed);
    }
    
    public void showSpeed(String location) {
        System.out.println("Location of the car: " + location);
    }

    @Override
    public void accelerate(double inc) {
        speed += inc;
        if(speed > 180) {
            throw new overspeedException("Speed limit exceeded");
        }
        System.out.println("Increases the speed by " + inc);
        System.out.println("After increasing the speed: " + speed);
    }

    @Override
    public void brake(double dec) {
        speed -= dec;
        if( speed < 0 ) speed = 0;
        System.out.println("Decreases the speed by " + dec);
        System.out.println("After decreasing the speed: " + speed);
    }
    
}
