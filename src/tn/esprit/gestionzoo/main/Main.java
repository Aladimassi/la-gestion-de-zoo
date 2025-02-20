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

        // Création des animaux
        Aquatic aquatic = new Aquatic("Fish", "Goldfish", 1, false, "Freshwater");
        Terrestrial terrestrial = new Terrestrial("Mammal", "Dog", 5, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 10, true, "Ocean", 55.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 100.0f);

        // Ajout des animaux au zoo
        zoo.addAnimal(aquatic);
        zoo.addAnimal(terrestrial);
        zoo.addAnimal(dolphin);
        zoo.addAnimal(penguin);

        // Affichage des informations du zoo
        zoo.displayZoo();

        // Appel de la méthode swim()
        aquatic.swim(); // Affiche "This aquatic animal is swimming."
        dolphin.swim(); // Affiche "This dolphin is swimming."
        penguin.swim(); // Affiche "This aquatic animal is swimming."
    }
}
