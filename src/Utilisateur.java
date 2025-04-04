public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private String motDePasse;
    private String role;

    public Utilisateur(int id, String nom, String email, String motDePasse, String role) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public void sInscrire() {
        System.out.println(nom + " s'est inscrit avec l'email : " + email);
    }

    public void seConnecter() {
        System.out.println(nom + " s'est connecté avec l'email : " + email);
    }

    public void sauvegarderFavoris(Oeuvre oeuvre) {
        System.out.println("L'œuvre " + oeuvre.getTitre() + " a été ajoutée aux favoris de " + nom);
    }

    // Getters et Setters (à générer avec Alt+Insert sur IntelliJ)

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
