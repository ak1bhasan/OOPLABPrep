package com.mycompany.emonanimal;

public class Animal implements Training {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) throws InvalidAgeException {
        if( age <= 0 ) {
            throw new InvalidAgeException("Can't Set Age below 0");
        }
        this.name = name;
        this.species = species;
        this.age = age;
    }

    

    public String getName() {
        if( age <= 0 ) {
            throw new InvalidAgeException("Can't Set Age below 0");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void animalInfo() {
        System.out.println("Name of the Animal: " + name + " & species: " + species);
    }
    
    public void showAge() {
        System.out.println("Age of the Animal: " + age);
    }
    
    public void showAge(String location) {
        System.out.println("Location: " + location);
    }

    @Override
    public void train(String skill) {
        System.out.println(name + " is being trained to " + skill + ".");
    }

    @Override
    public void performSkill(String skill)  {
        System.out.println(name + " performs the skill: " + skill + "." );
    }

    
    
}
