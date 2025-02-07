import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbrCages;
        String zooName;

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


        scanner.nextLine();


        do {
            System.out.println("Entrer le nom du zoo (non vide) :");
            zooName = scanner.nextLine().trim();

            if (zooName.isEmpty()) {
                System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
            }
        } while (zooName.isEmpty());

        scanner.close();


        System.out.printf("%s comporte %d cages.\n", zooName, nbrCages);
    }
}
