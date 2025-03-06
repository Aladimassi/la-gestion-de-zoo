package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + '\'';
    }

    // Méthode abstraite swim()
    public abstract void swim();

    // Redéfinition de la méthode equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Même référence, donc égaux
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Objet null ou classe différente, donc non égaux
        }
        Aquatic other = (Aquatic) obj; // Conversion en Aquatic
        return getAge() == other.getAge() && // Comparaison de l'âge
                getName().equals(other.getName()) && // Comparaison du nom
                habitat.equals(other.habitat); // Comparaison de l'habitat
    }
}