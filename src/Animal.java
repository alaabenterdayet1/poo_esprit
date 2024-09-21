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

    @Override
    public String toString() {
        return super.toString() + " [Famille : " + family + ", Nom : " + name + ", Age : " + age + ", Mammifère : " + isManimal + "]";
    }

}
                     