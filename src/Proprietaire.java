public class Proprietaire {
    private String nom;
    private String prenom;
    private String telephone;

    public Proprietaire(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public Proprietaire(String nom, String prenom) {
        this(nom, prenom, null);
    }
}
