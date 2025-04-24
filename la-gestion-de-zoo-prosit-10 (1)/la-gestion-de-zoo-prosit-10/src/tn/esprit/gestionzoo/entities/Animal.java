package tn.esprit.gestionzoo.entities;

public abstract class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        setName(name); // Validation via the setter
        setAge(age); // Validation via the setter
        this.isMammal = isMammal;
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
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge d'un animal ne peut pas être négatif.");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public abstract void eatMeat(Food meat);

    public abstract void eatPlant(Food plant);

    public abstract void eatPlantAndMeat(Food food);
}