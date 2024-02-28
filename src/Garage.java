import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicule> listeVehicules;

    public Garage() {
        this.listeVehicules = new ArrayList<>();
    }

    public void enregistrerVehicule(Vehicule vehicule) {
        listeVehicules.add(vehicule);
    }

    public int nombreVehiculesParticuliers() {
        int count = 0;
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule instanceof VehiculeParticulier) {
                count++;
            }
        }
        return count;
    }

    public int compterVehicules() {
        return listeVehicules.size();
    }

    public void afficherVehiculesSousSeuilReparation(double seuil) throws AucunVehiculeTrouve {
        boolean found = false;
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.getMontantReparation() < seuil) {
                vehicule.afficher();
                found = true;
            }
        }
        if (!found) {
            throw new AucunVehiculeTrouve();
        }
    }

    public ArrayList<Vehicule> chercherVehicules(int puissanceMin, int nombrePlacesMin) throws AucunVehiculeTrouve {
        ArrayList<Vehicule> result = new ArrayList<>();
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.getPuissanceFiscale() >= puissanceMin && vehicule.getNombrePlaces() >= nombrePlacesMin) {
                result.add(vehicule);
            }
        }
        if (result.isEmpty()) {
            throw new AucunVehiculeTrouve();
        }
        return result;
    }
}
