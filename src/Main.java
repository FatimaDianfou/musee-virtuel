public class Main {
    public static void main(String[] args) {
        // Création d’un utilisateur
        Utilisateur utilisateur = new Utilisateur(1, "Fatima", "fatima@mail.com", "pass123", "admin");
        utilisateur.sInscrire();
        utilisateur.seConnecter();

        // Création d’une œuvre
        Oeuvre oeuvre1 = new Oeuvre(101, "Masque Dogon", "Masque en bois sculpté", "1850", "image.jpg");

        // Création d’un commentaire
        Commentaire commentaire1 = new Commentaire(1, "Très belle œuvre !", "Ali", "2025-04-04");
        oeuvre1.commenter(commentaire1);

        // Création d’une exposition
        Exposition exposition = new Exposition(10, "Art Africain", "Exposition d’œuvres anciennes", "Mali", "2025-04-01");
        exposition.ajouterOeuvre(oeuvre1);
        exposition.afficherExposition();

        // Afficher les détails et les commentaires
        oeuvre1.afficherDetails();
        commentaire1.afficherCommentaire();

        // Ajouter l’œuvre aux favoris de l’utilisateur
        utilisateur.sauvegarderFavoris(oeuvre1);
    }
}
