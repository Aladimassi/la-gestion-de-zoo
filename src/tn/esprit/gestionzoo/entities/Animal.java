package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Méthode d'affichage
    public void displayAnimal() {
        System.out.println("Nom de l'animal : " + name);
        System.out.println("Famille : " + family);
        System.out.println("Âge : " + age + " ans");
        System.out.println("Mammifère : " + (isMammal ? "Oui" : "Non"));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return name.equalsIgnoreCase(animal.name) && family.equalsIgnoreCase(animal.family);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [name=" + name + ", family=" + family + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
