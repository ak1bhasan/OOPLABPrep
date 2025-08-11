package com.mycompany.animal;


public class Cat extends Pet {
    
    public Cat(String pet_name, int age) {
        super(pet_name, age);
    }
    
    public void meow() {
        System.out.println("Meow!");
    }
    
}
