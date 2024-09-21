import java.util.Scanner;

public class ZooManagement {
    public int nbrCages;
    public String zooName;

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        // Obtenir le nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = scanner.nextLine();
        while (zooManagement.zooName.isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Veuillez entrer un nom valide : ");
            zooManagement.zooName = scanner.nextLine();
        }

        // Obtenir le nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre valide pour le nombre de cages : ");
            scanner.next();
        }
        zooManagement.nbrCages = scanner.nextInt();

        // Vérifier que le nombre de cages est valide
        while (zooManagement.nbrCages <= 0 || zooManagement.nbrCages > 50) {
            System.out.print("Le nombre de cages doit être compris entre 1 et 50. Veuillez entrer un nombre valide : ");
            zooManagement.nbrCages = scanner.nextInt();
        }

        scanner.close();


        zooManagement.displayZooInfo();

        zooManagement.createAndDisplayZoo();
    }

    public void displayZooInfo() {
        System.out.println("Le zoo " + zooName + " comporte " + nbrCages + " cages.");
    }

    public void createAndDisplayZoo() {

        Zoo zoo = new Zoo(zooName, "Tunis", nbrCages);


        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal eagle = new Animal("Oiseau", "Aigle", 3, false);
        Animal dolphin = new Animal("Cétacé", "Dauphin", 8, true);


        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);
        zoo.addAnimal(dolphin);
        System.out.println(zoo.toString());
    }
}
