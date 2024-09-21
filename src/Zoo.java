public class Zoo {


    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }


    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }
    //toString method
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
