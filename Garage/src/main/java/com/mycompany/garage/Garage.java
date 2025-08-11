package com.mycompany.garage;


public class Garage {

    public static void main(String[] args) {
        Car car = new Car("BMW 7", 220, 2015 );
        car.carDetails();
        System.out.println( car.isFast() ? "Fast" : "NO" );
    }
}
