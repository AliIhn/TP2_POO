public class AucunVehiculeTrouve extends Exception {
    public AucunVehiculeTrouve() {
        super("Aucun véhicule trouvé.");
    }

    public AucunVehiculeTrouve(String message) {
        super(message);
    }
}
