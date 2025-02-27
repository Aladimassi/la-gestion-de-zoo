package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création d'un zoo
        Zoo zoo = new Zoo("Safari Park", "Paris");
        Penguin penguin1 = new Penguin("Oiseau", "Pingu", 3, false, "Antarctique", 50.0f);
        Penguin penguin2 = new Penguin("Oiseau", "Tux", 4, false, "Antarctique", 70.0f);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);
        System.out.println("Profondeur maximale de nage des pingouins : " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
        // Création des animaux aquatiques
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 10, true, "Ocean", 55.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 100.0f);
        Dolphin dolphin1 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 50.0f);
        Dolphin dolphin2 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 60.0f);
        System.out.println(dolphin1.equals(dolphin2));
        // Création d'un animal terrestre
        Terrestrial terrestrial = new Terrestrial("Mammal", "Dog", 5, true, 4);

        // Ajout des animaux aquatiques au zoo

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        // Ajout de l'animal terrestre au zoo
        zoo.addAnimal(terrestrial);

        // Affichage des informations du zoo
        zoo.displayZoo();

        // Appel de la méthode swim() pour les animaux aquatiques

        dolphin.swim(); // Affiche "This dolphin is swimming."
        penguin.swim(); // Affiche "This aquatic animal is swimming."
    }
}