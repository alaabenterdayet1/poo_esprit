package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isManimal;

    public Animal(String family, String name, int age, boolean isManimal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isManimal = isManimal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isManimal() {
        return isManimal;
    }

    public void setManimal(boolean isManimal) {
        this.isManimal = isManimal;
    }

    @Override
    public String toString() {
        return "Famille : " + family + " Nom : " + name + " Age : " + age + " Est un mammifère : " + isManimal;
    }
}