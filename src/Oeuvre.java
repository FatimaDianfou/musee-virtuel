import java.util.ArrayList;
import java.util.List;

public class Oeuvre {
    private int id;
    private String titre;
    private String description;
    private String date;
    private String media;

    private List<Commentaire> commentaires;

    public Oeuvre(int id, String titre, String description, String date, String media) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.media = media;
        this.commentaires = new ArrayList<>();
    }

    public void afficherDetails() {
        System.out.println("Œuvre : " + titre + " - " + description + " (" + date + ")");
        System.out.println("Média associé : " + media);
    }

    public void commenter(Commentaire commentaire) {
        commentaires.add(commentaire);
        System.out.println("Nouveau commentaire ajouté.");
    }

    public void partager() {
        System.out.println("Partage de l'œuvre : " + titre);
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", media='" + media + '\'' +
                ", commentaires=" + commentaires +
                '}';
    }
}
