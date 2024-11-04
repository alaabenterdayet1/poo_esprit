// src/tn/esprit/gestionzoo/entities/Terrestrial.java
package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private String habitat;

    public Terrestrial(String family, String name, int age, boolean isManimal, String habitat) {
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

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plant.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plant and meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }
}