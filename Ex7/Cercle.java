package Ex7;

public class Cercle extends Forme {
	double rayon;
	
	public Cercle (double rayon) {
		this.rayon =rayon;
	}
	
	public double calculerSurface() {
        return 3.14 * rayon * rayon;
    }
	
	public void calculerPerimetre() {
        double p = 2 * 3.14 * rayon;
        System.out.println("Perimetre du cercle: " + p);
    }
	
	public void validerDimensions() {
        if (rayon > 0) {
            System.out.println("Rayon valide");
        } else {
            System.out.println("Rayon invalide");
        }
    }
	

}
