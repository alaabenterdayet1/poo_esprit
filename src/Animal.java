public class Animal {
    public  String  family ;
    public  String name ;
    public int age ;
    public  boolean isManimal ;


    public Animal(String family, String name, int age, boolean isManimal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isManimal = isManimal;
    }


    public String toString() {
        return "Famille : " + family + "\nNom : " + name + "\nAge : " + age + "\nMammifère : " + isManimal;
    }

}
                     