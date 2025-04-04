public class Commentaire {
    private int id;
    private String texte;
    private String auteur;
    private String date;

    public Commentaire(int id, String texte, String auteur, String date) {
        this.id = id;
        this.texte = texte;
        this.auteur = auteur;
        this.date = date;
    }

    public void afficherCommentaire() {
        System.out.println("[" + date + "] " + auteur + " a dit : " + texte);
    }

    public void supprimerCommentaire() {
        System.out.println("Commentaire supprimé.");
    }

    // Getters et Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", texte='" + texte + '\'' +
                ", auteur='" + auteur + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
