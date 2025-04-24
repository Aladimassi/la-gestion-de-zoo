package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int MAX_CAGES = 3; // Reduced to 3 as per instruction
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.animalCount = 0;
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= 10) {
            System.out.println("Erreur : Le tableau des animaux aquatiques est plein (maximum 10) !");
            return;
        }

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i].equals(aquatic)) {
                System.out.println("Erreur : Cet animal aquatique est déjà dans le zoo.");
                return;
            }
        }

        aquaticAnimals[aquaticCount++] = aquatic;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (isZooFull()) {
            throw new ZooFullException("Erreur : Le zoo est plein !");
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                System.out.println("Erreur : Cet animal est déjà dans le zoo.");
                return;
            }
        }

        animals[animalCount++] = animal;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_CAGES;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        boolean foundPenguin = false;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                float depth = penguin.getSwimmingDepth();
                if (!foundPenguin || depth > maxDepth) {
                    maxDepth = depth;
                    foundPenguin = true;
                }
            }
        }

        if (!foundPenguin) {
            System.out.println("Aucun pingouin trouvé dans le zoo.");
            return 0.0f;
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    public void displayZoo() {
        System.out.println("\n--- Informations du Zoo ---");
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre d'animaux : " + animalCount);
        System.out.println("Capacité maximale : " + MAX_CAGES);

        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("\nListe des animaux aquatiques :");
        for (int i = 0; i < aquaticCount; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }
}