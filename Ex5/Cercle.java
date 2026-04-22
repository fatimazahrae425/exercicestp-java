package Ex5;

public class Cercle extends Figure {
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;

	}
	public void dessiner() {
		System.out.println("Dessin d'un Cercle de rayon: " + rayon);
	}
	public void calculerPerimetre() {
        double p = 2 * 3.14 * rayon;
        System.out.println("Perimetre du cercle: " + p);
    }
	public void calculerSurface() {
        double s = 3.14 * rayon * rayon;
        System.out.println("Surface du cercle: " + s);
    }

}