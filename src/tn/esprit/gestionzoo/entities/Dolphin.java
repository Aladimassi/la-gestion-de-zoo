package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Corrected constructor
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
        // Validate age before calling super()
        super(family, name, Math.max(age, 0), isMammal, habitat); // Set age to 0 if negative
        this.swimmingSpeed = swimmingSpeed;

        // Warn if age was invalid
        if (age < 0) {
            System.out.println("Invalid age provided for Dolphin. Default age set to 0.");
        }
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }

    @Override
    public void eatPlant(Food plant) {

    }

    @Override
    public void eatPlantAndMeat(Food food) {

    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}