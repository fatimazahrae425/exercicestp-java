package Ex9;

public class VoitureElectrique extends Vehicule implements Electrique{
	
	public void demarrer() {
        System.out.println("La voiture electrique demarre");
    }
	public void charger() {
        System.out.println("La voiture est en cours de chargement");
    }

    public void verifierBatterie() {
        System.out.println("Batterie a 85%");
    }

    public void afficherAutonomie() {
        System.out.println("Autonomie restante: 300 km");
    }

    public void optimiserConsommation() {
        System.out.println("Mode ECO active pour optimiser la consommation");
    }
	

}
