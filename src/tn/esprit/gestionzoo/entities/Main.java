package tn.esprit.gestionzoo.entities;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Safari Park", "Paris");

        // Ajout d'animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);

        // Affichage des animaux
        zoo.displayZoo();

        // Recherche d'un animal
        System.out.println("Recherche du lion : " + zoo.searchAnimal("Lion"));

        // Tentative d'ajouter un animal déjà existant
        zoo.addAnimal(lion);

        // Suppression d'un animal
        zoo.removeAnimal(tiger);
        zoo.displayZoo();

        // Comparaison de deux zoos
        Zoo zoo2 = new Zoo("Wildlife Sanctuary", "Lyon");
        zoo2.addAnimal(new Animal("Canidae", "Wolf", 4, true));
        Zoo biggerZoo = Zoo.comparerZoo(zoo, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.toString());
    }
}
