public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les informations de l'animal
    public void displayAnimal() {
        System.out.println("Nom de l'animal : " + name);
        System.out.println("Famille : " + family);
        System.out.println("Âge : " + age + " ans");
        System.out.println("Mammifère : " + (isMammal ? "Oui" : "Non"));
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal [name=" + name + ", family=" + family + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
