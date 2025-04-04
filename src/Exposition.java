import java.util.ArrayList;
import java.util.List;

public class Exposition {
    private int id;
    private String titre;
    private String description;
    private String regionOrigine;
    private String date;

    private List<Oeuvre> listeOeuvres;

    public Exposition(int id, String titre, String description, String regionOrigine, String date) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.regionOrigine = regionOrigine;
        this.date = date;
        this.listeOeuvres = new ArrayList<>();
    }

    public void ajouterOeuvre(Oeuvre oeuvre) {
        listeOeuvres.add(oeuvre);
        System.out.println("Œuvre ajoutée : " + oeuvre.getTitre());
    }

    public void supprimerOeuvre(Oeuvre oeuvre) {
        listeOeuvres.remove(oeuvre);
        System.out.println("Œuvre supprimée : " + oeuvre.getTitre());
    }

    public void afficherExposition() {
        System.out.println("Exposition : " + titre + " - " + description + " (" + regionOrigine + ")");
        for (Oeuvre o : listeOeuvres) {
            o.afficherDetails();
        }
    }

    // Getters et Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public String getRegionOrigine() {
        return regionOrigine;
    }

    public String getDate() {
        return date;
    }

    public List<Oeuvre> getListeOeuvres() {
        return listeOeuvres;
    }

    public void setListeOeuvres(List<Oeuvre> listeOeuvres) {
        this.listeOeuvres = listeOeuvres;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRegionOrigine(String regionOrigine) {
        this.regionOrigine = regionOrigine;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Exposition{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", regionOrigine='" + regionOrigine + '\'' +
                ", date='" + date + '\'' +
                ", listeOeuvres=" + listeOeuvres +
                '}';
    }
}
