package Ex2;

public class Voiture extends Vehicule {
    int nbPortes; 
    String carburant; 

    
    public Voiture(String marque, int nbPortes, String carburant) {
        super(marque); 
        this.nbPortes = nbPortes;
        this.carburant = carburant;
    }

    public void afficherDetails() { 
        afficherMarque();
        System.out.println("Portes : " + nbPortes + " | Carburant : " + carburant);
    }

    public void klaxonner() { 
        System.out.println("la voiture klaxone");
    }
}
