// src/tn/esprit/gestionzoo/main/ZooManagment.java
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagment {
    public static <Balan> void main(String[] args) {
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 5);
        Animal lion = new Animal("Félidé", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, false);
        Animal zebra = new Animal("Équidés", "Marty", 7, false);

        // Utilisation des constructeurs par défaut
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 20.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctic", 30.0f);
        Aquatic genericAquatic = new Aquatic("Fish", "Goldfish", 1, false, "Freshwater");

        // Ajout des animaux aquatiques au zoo
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(genericAquatic);

        // Affichage des objets créés
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(genericAquatic);

        // Appel des méthodes swim
        genericAquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}