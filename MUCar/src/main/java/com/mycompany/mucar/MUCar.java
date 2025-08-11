package com.mycompany.mucar;


public class MUCar {

    public static void main(String[] args) {
        try{
            Car cr = new Car("Emon", "Botla", 10);
            cr.carInfo();
            cr.showSpeed();
            cr.showSpeed("Botesshor");

            cr.accelerate(10.5);
            cr.brake(0);

            ElectricCar ecr = new ElectricCar(1.2, "HasinarGari", "BMW", 200.10);
            ecr.carInfo();
            ecr.showSpeed();
            ecr.showSpeed("India");

            ecr.accelerate(120);
            ecr.brake(100.34);
            
        } catch(overspeedException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
