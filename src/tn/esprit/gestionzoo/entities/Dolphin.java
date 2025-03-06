package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        // Call the superclass constructor and handle InvalidAgeException
        try {
            super(family, name, age, isMammal, habitat);
        } catch (InvalidAgeException e) {
            // Handle the exception (e.g., set a default age or log the error)
            System.out.println("Invalid age provided for Dolphin. Setting default age to 0.");
            try {
                super(family, name, 0, isMammal, habitat); // Set default age to 0
            } catch (InvalidAgeException ex) {
                // This should never happen since age is now 0
                throw new RuntimeException("Unexpected error while setting default age.", ex);
            }
        }
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
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}