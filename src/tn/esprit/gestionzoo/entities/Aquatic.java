package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
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
}
