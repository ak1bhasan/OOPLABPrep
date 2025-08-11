package com.mycompany.garage;

public class Car {
    private String model_name;
    private int speed;
    private int year;

    public Car(String model_name, int speed, int year) {
        this.model_name = model_name;
        this.speed = speed;
        this.year = year;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void carDetails() {
        System.out.println("Car model name: " + model_name);
        System.out.println("Car speed: " + speed + " km/h");
        System.out.println("The year Car made: " + year);
    }
    
    public boolean isFast() {
        return speed >= 150;
    }
    
}
