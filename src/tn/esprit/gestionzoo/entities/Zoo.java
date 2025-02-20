package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int MAX_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein !");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Erreur : Cet animal est déjà dans le zoo.");
                return false;
            }
        }

        animals[animalCount++] = animal;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    public void displayZoo() {
        System.out.println("\n--- Informations du Zoo ---");
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre d'animaux : " + animalCount);
        System.out.println("Capacité maximale : " + MAX_CAGES);

        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
}