import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    // Instruction 1: Collection dynamique de paires clé-valeur
    private HashMap<Employe, Departement> affectations;
    
    public AffectationHashMap() {
        affectations = new HashMap<>();
    }
    
    // Instruction 2: Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }
    
    // Instruction 3: Afficher tous les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + " | Département: " + entry.getValue());
        }
    }
    
    // Instruction 4: Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }
    
    // Instruction 5: Supprimer un employé d'un département spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }
    
    // Instruction 6: Afficher la liste des employés
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }
    
    // Instruction 7: Afficher la liste des départements
    public void afficherDepartements() {
        // Utilisation d'un HashSet pour éviter les doublons
        java.util.HashSet<Departement> uniqueDepartements = new java.util.HashSet<>(affectations.values());
        for (Departement d : uniqueDepartements) {
            System.out.println(d);
        }
    }
    
    // Instruction 8: Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    
    // Instruction 9: Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.values().contains(d);
    }
    
    // Instruction 10: Trier les employés selon leur ID
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}