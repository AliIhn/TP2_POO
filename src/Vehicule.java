public class Vehicule {
    private String marque;
    private int puissanceFiscale;
    private int nombrePlaces;
    private Proprietaire proprietaire;
    private double montantReparation;

    public Vehicule(String marque, int puissanceFiscale, int nombrePlaces, Proprietaire proprietaire, double montantReparation) {
        this.marque = marque;
        this.puissanceFiscale = puissanceFiscale;
        this.nombrePlaces = nombrePlaces;
        this.proprietaire = proprietaire;
        this.montantReparation = montantReparation;
    }

    public void afficher() {
        // Afficher les détails du véhicule
    }

    public double getMontantReparation() {
        return montantReparation;
    }

    public int getPuissanceFiscale() {
        return puissanceFiscale;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }
}
