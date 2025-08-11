package com.mycompany.emonanimal;

public class Pet extends Animal {
    private String ownerName;

    public Pet(String ownerName, String name, String species, int age) throws InvalidAgeException {
        super(name, species, age);
        this.ownerName = ownerName;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void animalInfo() {
        super.animalInfo(); 
        System.out.println("name of the owner: " + ownerName);
    }

    
}
