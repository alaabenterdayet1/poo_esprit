import java.util.Scanner;

public class ZooManagement {
    public int nbrCages;
    public String zooName;

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo National", "Paris", 3);


        Animal lion = new Animal("Félidé", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, false);
        Animal zebra = new Animal("Équidés", "Marty", 7, false);

        // Ajout statique des animaux au zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(zebra);

        System.out.println(lion.toString());
        System.out.println(elephant.toString());
        System.out.println(zebra.toString());
        System.out.println("****************************************");
        // Affichage du zoo avec les animaux
        System.out.println(zoo);


    }
}

