package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isManimal, String habitat, float swimmingSpeed) {
        super(family, name, age, isManimal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " Vitesse de nage : " + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
