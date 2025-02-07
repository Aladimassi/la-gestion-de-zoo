import java.util.ArrayList;

public class Zoo {
    private final int MAX_CAGES = 25; // Nombre maximal de cages
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount; // Compteur pour le nombre d'animaux dans le zoo

    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.animalCount = 0;
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

    // Méthode pour afficher tous les animaux
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            animals[i].displayAnimal();
        }
    }

    // Méthode pour rechercher un animal par son nom
    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // Animal non trouvé
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                // Décaler les autres animaux pour combler l'espace
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[--animalCount] = null; // Réduire le compteur et nettoyer la dernière case
                return true;
            }
        }
        System.out.println("Erreur : Animal non trouvé.");
        return false;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    // Méthode pour comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    // Méthode d'affichage du zoo
    public void displayZoo() {
        System.out.println("\n--- Informations du Zoo ---");
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre d'animaux : " + animalCount);
        System.out.println("Capacité maximale : " + MAX_CAGES);
        displayAnimals();
    }
}
