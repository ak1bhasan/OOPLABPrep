package com.mycompany.emonanimal;


public class EmonAnimal {

    public static void main(String[] args) {
        Animal anm = new Animal("Emon", "hulk", 23);
        anm.animalInfo();
        anm.showAge();
        anm.showAge("Amphibian");
        anm.train("Varsity theke bashay hete jabe");
        anm.performSkill("Gamer");
        
       Pet pt = new Pet("Akib", "Tom", "abcd", 5);
       pt.animalInfo();
       pt.showAge();
       anm.train("Potty Training");
       anm.performSkill("kamchi dewa");
       
       try{
           Pet pt1 = new Pet("JAX","Ghost", "cat", 0);
       } catch(InvalidAgeException e) {
               System.out.println("Exception: " + e.getMessage());
               }
       
    }
}
