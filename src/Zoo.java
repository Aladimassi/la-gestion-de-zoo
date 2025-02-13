public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // Initialise le tableau
    }

    // Méthode pour ajouter un animal
    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < nbrCages) {
            animals[index] = animal;
        } else {
            System.out.println("Erreur : Index hors limites.");
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Liste des animaux :");

        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.toString());
            } else {
                System.out.println("Cage vide.");
            }
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
