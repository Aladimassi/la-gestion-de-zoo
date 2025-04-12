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
    }
}