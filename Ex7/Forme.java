package Ex7;

public abstract class Forme {
	public abstract double calculerSurface();
	
	public void afficherDescription() {
        System.out.println("Ceci est une forme geometrique.");
    }
	public void comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface()) {
            System.out.println("La premiere forme est plus grande.");
        } else {
            System.out.println("La deuxieme forme est plus grande ou egale.");
        }
    }
}