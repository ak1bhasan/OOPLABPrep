package com.mycompany.animal;


public class Pet {
    private String pet_name;
    private int age;

    public Pet(String pet_name, int age) {
        this.pet_name = pet_name;
        this.age = age;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int displayInfo() {
        System.out.println("Name: " + pet_name);
        System.out.println("Age: " + age);
        return age;
    }
    
}
