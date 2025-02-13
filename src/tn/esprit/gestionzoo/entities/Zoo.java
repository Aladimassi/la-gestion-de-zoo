package tn.esprit.gestionzoo.entities;

public class Zoo {
    // Attributs privés
    private final int MAX_CAGES = 25; // Nombre maximal de cages
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount; // Compteur pour le nombre d'animaux dans le zoo

    // Constructeur
    public Zoo(String name, String city) {
        setName(name); // Validation via le setter
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.animalCount = 0;
    }

    // Getter pour name
    public String getName() {
        return name;
    }

    // Setter pour name avec validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    // Getter pour city
    public String getCity() {
        return city;
    }

    // Setter pour city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter pour animalCount
    public int getAnimalCount() {
        return animalCount;
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein !");
            return false;
        }

        // Vérifier si l'animal existe déjà dans le zoo
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Erreur : Cet animal est déjà dans le zoo.");
                return false;
            }
        }

        animals[animalCount++] = animal;
        return true;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    // Méthode d'affichage
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
