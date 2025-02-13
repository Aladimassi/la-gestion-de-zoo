package tn.esprit.gestionzoo.entities;

public class Animal {
    // Attributs privés
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        setName(name); // Validation via le setter
        setAge(age); // Validation via le setter
        this.isMammal = isMammal;
    }

    // Getter pour family
    public String getFamily() {
        return family;
    }

    // Setter pour family
    public void setFamily(String family) {
        this.family = family;
    }

    // Getter pour name
    public String getName() {
        return name;
    }

    // Setter pour name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide.");
        }
        this.name = name;
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Setter pour age avec validation
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif.");
        }
        this.age = age;
    }

    // Getter pour isMammal
    public boolean isMammal() {
        return isMammal;
    }

    // Setter pour isMammal
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
