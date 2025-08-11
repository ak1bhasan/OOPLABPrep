
package com.mycompany.animal;


public class Dog extends Pet {
    
    public Dog(String pet_name, int age) {
        super(pet_name, age);
    }
    
    public void bark() {
        System.out.println("Woof!");
    }
    
}
