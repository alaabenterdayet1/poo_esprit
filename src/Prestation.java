import java.util.Objects;

public abstract class Prestation {
    private int id;
    private String nomProjet;
    private String nomClient;

    // Constructeurs
    public Prestation() {}

    public Prestation(int id, String nomProjet, String nomClient) {
        this.id = id;
        this.nomProjet = nomProjet;
        this.nomClient = nomClient;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    // Redéfinition de toString, hashCode et equals
    @Override
    public String toString() {
        return "Prestation{id=" + id + ", nomProjet='" + nomProjet + '\'' +
                ", nomClient='" + nomClient + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestation that = (Prestation) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
