package Ex2;

public class Test {
    public static void main(String[] args) {

        Vehicule v = new Vehicule("Toyota");
        v.afficherMarque();
        v.demarrer();
        v.arreter();
        Voiture vt = new Voiture("BMW", 4, "Diesel");
        vt.afficherDetails();
        vt.demarrer();
        vt.klaxonner();
        vt.arreter();
    }
}