package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagment {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 5);
        Animal lion = new Animal("Félidé", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, false);
        Animal zebra = new Animal("Équidés", "Marty", 7, false);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(zebra);

        System.out.println(zoo);
    }

}
