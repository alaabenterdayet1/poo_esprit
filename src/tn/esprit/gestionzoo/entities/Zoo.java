package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.InvalidAgeException;
import tn.esprit.gestionzoo.entities.InvalidAgeException;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
    }

    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;
            }
        }
        return true;
    }

    // Create
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }

        if (isZooFull()) {
            throw new ZooFullException("Le zoo est plein.");
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return;
            }
        }
    }

    // Read
    public Animal getAnimal(int index) {
        if (index >= 0 && index < animals.length) {
            return animals[index];
        }
        return null;
    }

    // Update
    public void updateAnimal(int index, Animal newAnimal) throws InvalidAgeException {
        if (newAnimal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }

        if (index >= 0 && index < animals.length && animals[index] != null) {
            animals[index] = newAnimal;
        }
    }


   

    // Delete
    public void deleteAnimal(int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = null;
        }
    }

    public void addAquaticAnimal(Aquatic aquaticAnimal) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquaticAnimal;
                break;
            }
        }
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public void displayAquaticAnimals() {
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal != null) {
                System.out.println(aquaticAnimal);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }

    @Override
    public String toString() {
        String result = "Nom du zoo : " + name + "\nVille : " + city + "\nNombre de cages : " + nbrCages + "\n";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                result += "\nCage " + (i + 1) + " : " + animals[i];
            }
        }
        return result;
    }
}