package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Validation manuelle pour le nom du zoo
        String zooName = "Safari Park";
        String zooCity = "Paris";
        if (zooName == null || zooName.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
            return;
        }

        Zoo zoo = new Zoo(zooName, zooCity);

        // Ajout d'animaux avec validation manuelle
        Animal lion = createAnimal("Felidae", "Lion", 5, true);
        Animal tiger = createAnimal("Felidae", "Tiger", 3, true);
        Animal elephant = createAnimal("Elephantidae", "Elephant", 10, false);

        if (lion != null) zoo.addAnimal(lion);
        if (tiger != null) zoo.addAnimal(tiger);
        if (elephant != null) zoo.addAnimal(elephant);

        // Affichage des informations du zoo
        zoo.displayZoo();

        // Ajout d'un animal invalide
        Animal invalidAnimal = createAnimal("Felidae", "Invalid", -2, true);
        if (invalidAnimal != null) zoo.addAnimal(invalidAnimal);

        // Création d'un zoo avec un nom vide
        String invalidZooName = "";
        if (invalidZooName == null || invalidZooName.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        } else {
            Zoo invalidZoo = new Zoo(invalidZooName, "Marseille");
            invalidZoo.displayZoo();
        }
    }

    // Méthode pour valider et créer un animal
    private static Animal createAnimal(String family, String name, int age, boolean isMammal) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom de l'animal ne peut pas être vide.");
            return null;
        }
        if (age < 0) {
            System.out.println("Erreur : L'âge d'un animal ne peut pas être négatif.");
            return null;
        }
        return new Animal(family, name, age, isMammal);
    }
}
