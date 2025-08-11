package com.mycompany.animal;

public class Animal {

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 2);
        
        dog.displayInfo();
        dog.bark();
        
        Cat cat = new Cat("Jerry", 1);
        cat.displayInfo();
        cat.meow();
    }
}
