package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println(getName() + " is eating meat: " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println(getName() + " is eating plant: " + plant);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println(getName() + " is eating both plant and meat: " + food);
    }
}