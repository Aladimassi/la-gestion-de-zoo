import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // Création d'une société
        SocieteArrayList societe = new SocieteArrayList();
        
        // Création de quelques employés
        Employe emp1 = new Employe(1, "Dupont", "Jean", "Informatique", 3);
        Employe emp2 = new Employe(2, "Martin", "Sophie", "Ressources Humaines", 2);
        Employe emp3 = new Employe(3, "Dubois", "Pierre", "Informatique", 4);
        
        // Ajout des employés à la société
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        
        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();
        
        // Recherche d'un employé par nom
        System.out.println("\nRecherche de Dupont : " + societe.rechercherEmploye("Dupont"));
        System.out.println("Recherche de Durand : " + societe.rechercherEmploye("Durand"));
        
        // Tri par ID
        System.out.println("\nListe des employés triés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();
        
        // Tri par département et grade
        System.out.println("\nListe des employés triés par département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        
        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé Dupont");
        societe.supprimerEmploye(emp1);
        
        // Affichage après suppression
        System.out.println("Liste des employés après suppression :");
        societe.displayEmploye();
        // Création des objets
        Employe e1 = new Employe(1, "Dupont", "Jean", "RH", 3);
        Employe e2 = new Employe(2, "Martin", "Sophie", "IT", 4);
        Employe e3 = new Employe(3, "Petit", "Marie", "Finance", 2);

        Departement d1 = new Departement(1, "Ressources Humaines");
        Departement d2 = new Departement(2, "Informatique");
        Departement d3 = new Departement(3, "Finance");

        // Création de l'objet AffectationHashMap
        AffectationHashMap affectation = new AffectationHashMap();

        // Ajout des employés aux départements
        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);
        affectation.ajouterEmployeDepartement(e3, d3);

        // Affichage des affectations
        System.out.println("===== Affectations initiales =====");
        affectation.afficherEmployesEtDepartements();

        // Test d'ajout du même employé dans un département différent
        System.out.println("\n===== Après réaffectation de Jean Dupont =====");
        affectation.ajouterEmployeDepartement(e1, d2);
        affectation.afficherEmployesEtDepartements();

        // Réponse à la question posée:
        System.out.println("\nRemarque : On constate que l'employé e1 a été réaffecté au département d2, " +
                "car la HashMap remplace la valeur si la clé existe déjà.");

        // Test de recherche
        System.out.println("\n===== Tests de recherche =====");
        System.out.println("Recherche de e1: " + affectation.rechercherEmploye(e1));
        System.out.println("Recherche de d3: " + affectation.rechercherDepartement(d3));

        // Test de suppression
        System.out.println("\n===== Après suppression de Marie Petit =====");
        affectation.supprimerEmploye(e3);
        affectation.afficherEmployesEtDepartements();

        // Test du tri
        System.out.println("\n===== Affectations triées par ID d'employé =====");
        TreeMap<Employe, Departement> triee = affectation.trierMap();
        for (Map.Entry<Employe, Departement> entry : triee.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + " | Département: " + entry.getValue());
        }

    }
}