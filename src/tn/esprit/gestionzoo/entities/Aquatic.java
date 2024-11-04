// src/tn/esprit/gestionzoo/entities/Aquatic.java
package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isManimal, String habitat) {
        super(family, name, age, isManimal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Habitat : " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }
}
