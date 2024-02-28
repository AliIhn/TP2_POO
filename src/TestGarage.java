import java.util.ArrayList;

public class TestGarage {
    public static void main(String[] args) {
        Garage gar = new Garage();
        ArrayList<Vehicule> listeVehicules;
        Proprietaire p1 = new Proprietaire("Dupont", "Pierre", "+33612345678");
        Proprietaire p2 = new Proprietaire("Durand", "Paul");
        System.out.println("Nombre de véhicules particuliers en réparation dans le Garage : " + gar.nombreVehiculesParticuliers());
        System.out.println("Nombre total de Vehicules en réparation dans le Garage : " + gar.compterVehicules());

        // Création d'un Vehicule de type Vehicule particulier et enregistrement
        VehiculeParticulier v = new VehiculeParticulier("Renault", 17, 5, p1, 780, 2023);
        gar.enregistrerVehicule(v);

        // Création d'un Vehicule de type Utilitaire et enregistrement
        Utilitaire u = new Utilitaire("Peugeot", 12, 3, p2, 600, 4500);
        gar.enregistrerVehicule(u);

        // Création d'un Vehicule de type Utilitaire et enregistrement
        u = new Utilitaire("Toyota", 10, 5, p1, 300, 3500);
        gar.enregistrerVehicule(u);

        // Afficher la liste des Vehicules réparés à moins de 750€
        try {
            System.out.println();
            System.out.println("Liste des Vehicules avec un montantReparation inférieur à 750 euros :");
            gar.afficherVehiculesSousSeuilReparation(750.0);
        } catch (AucunVehiculeTrouve e) {
            System.out.println("Aucun Vehicule réparé par le Garage ne répond à votre critère...");
        }

        System.out.println();
        System.out.println("Nombre de véhicules particuliers en réparation dans le Garage : " + gar.nombreVehiculesParticuliers());
        System.out.println("Nombre total de Vehicules en réparation dans le Garage : " + gar.compterVehicules());

        // Trouver la liste des Vehicules avec la puissance minimale et le nombre de places minimal indiqué
        try {
            System.out.println();
            System.out.println("Liste des Vehicules avec une puissance d'au moins 10 Chevaux Fiscaux et un nombre de places supérieur ou égal à 4 :");
            int puissanceMin = 10;
            int nombrePlacesMin = 4;
            listeVehicules = gar.chercherVehicules(puissanceMin, nombrePlacesMin);
            for (Vehicule b : listeVehicules) {
                System.out.println(b);
                // afficher les caractéristiques du véhicule b
                b.afficher();
                System.out.println();
            }
        } catch (AucunVehiculeTrouve e) {
            System.out.println("Aucun Vehicule réparé par le Garage ne répond à votre critère...");
        }
    }
}
