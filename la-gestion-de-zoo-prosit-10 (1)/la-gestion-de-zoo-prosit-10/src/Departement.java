public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployés;

    // Constructeur sans paramètre
    public Departement(int i, String ressourcesHumaines) {
        this.id = 0;
        this.nomDepartement = "";
        this.nombreEmployés = 0;
    }

    // Constructeur avec paramètres
    public Departement(int id, String nomDépartement, int nombreEmployés) {
        this.id = id;
        this.nomDepartement = nomDépartement;
        this.nombreEmployés = nombreEmployés;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNomDépartement() {
        return nomDepartement;
    }

    public int getNombreEmployés() {
        return nombreEmployés;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNomDépartement(String nomDépartement) {
        this.nomDepartement = nomDépartement;
    }

    public void setNombreEmployés(int nombreEmployés) {
        this.nombreEmployés = nombreEmployés;
    }

    // Redéfinition de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Departement that = (Departement) obj;
        return id == that.id && nomDepartement.equals(that.nomDepartement);
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Département{" +
                "id=" + id +
                ", nomDépartement='" + nomDepartement + '\'' +
                ", nombreEmployés=" + nombreEmployés +
                '}';
    }
}