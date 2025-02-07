import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbrCages;
        String zooName;

        // Saisie du nombre de cages
        do {
            System.out.println("Entrer le nombre de cages (entier positif) :");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            nbrCages = scanner.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Erreur : Le nombre doit être un entier positif.");
            }
        } while (nbrCages <= 0);

        scanner.nextLine(); // Consommer le retour à la ligne

        // Saisie du nom du zoo
        do {
            System.out.println("Entrer le nom du zoo (non vide) :");
            zooName = scanner.nextLine().trim();

            if (zooName.isEmpty()) {
                System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
            }
        } while (zooName.isEmpty());

        // Création du zoo
        Zoo myZoo = new Zoo(zooName, "Paris", nbrCages);

        // Création d'un animal (lion) avec le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Ajout du lion au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations du zoo
        myZoo.displayZoo();

        // Affichage direct via toString()
        System.out.println(myZoo.toString());

        // Affichage direct des informations de l'animal
        System.out.println(lion.toString());

        scanner.close();
    }
}
