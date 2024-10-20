
package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private Aquatic [] aquaticAnimals;
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

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
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

    public void addAquaticAnimal(Aquatic aquaticAnimal) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquaticAnimal;
                break;
            }
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

