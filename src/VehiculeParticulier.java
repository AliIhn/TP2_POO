public class VehiculeParticulier extends Vehicule {
    private Proprietaire proprietaire;
    private int anneeMiseEnCirculation;

    public VehiculeParticulier(String marque, int puissanceFiscale, int nombrePlaces, Proprietaire proprietaire, double montantReparation, int anneeMiseEnCirculation) {
        super(marque, puissanceFiscale, nombrePlaces, montantReparation);
        this.proprietaire = proprietaire;
        this.anneeMiseEnCirculation = anneeMiseEnCirculation;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public int getAnneeMiseEnCirculation() {
        return anneeMiseEnCirculation;
    }

    @Override
    public void afficher() {
        System.out.println("VehiculeParticulier : " + getMarque());
        System.out.println("puissance : " + getPuissanceFiscale());
        System.out.println("nombre de places : " + getNombrePlaces());
        System.out.println("Propriétaire : " + proprietaire);
        System.out.println("montantReparation : " + getMontantReparation());
        System.out.println("anne : " + anneeMiseEnCirculation);
    }
}
