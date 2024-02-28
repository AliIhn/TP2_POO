public class Utilitaire extends Vehicule {
    private double poids;

    public Utilitaire(String marque, int puissanceFiscale, int nombrePlaces, Proprietaire proprietaire, double montantReparation, double poids) {
        super(marque, puissanceFiscale, nombrePlaces, montantReparation);
        this.poids = poids;
    }

    public double getPoids() {
        return poids;
    }

    @Override
    public void afficher() {
        System.out.println("Utilitaire : " + getMarque());
        System.out.println("puissance : " + getPuissanceFiscale());
        System.out.println("nombre de places : " + getNombrePlaces());
        System.out.println("Propriétaire : " + getProprietaire());
        System.out.println("montantReparation : " + getMontantReparation());
        System.out.println("poids : " + poids);
    }
}

