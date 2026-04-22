package Ex9;

public abstract class Vehicule {
	double vitesse;
	
	public void accelerer() {
		vitesse = vitesse + 10;
        System.out.println("Acceleration: " + vitesse + " km/h");
	}
	public void freiner() {
        if (vitesse >= 10) vitesse = vitesse - 10;
        System.out.println("Freinage: " + vitesse + " km/h");
    }
	public abstract void demarrer();

}
