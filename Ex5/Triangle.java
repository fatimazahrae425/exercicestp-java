package Ex5;
public class Triangle extends Figure {
	double cote1, cote2, cote3;
	double  hauteur;
	public Triangle(double c1, double c2, double c3, double h) {
		 this.cote1 = c1;
	     this.cote2 = c2;
	     this.cote3 = c3;
	     this.hauteur = h;
    }
	public void dessiner() {
        System.out.println("Dessin d'un Triangle de cotes: " + cote1 + ", " + cote2 + ", " + cote3);
    }
	public void calculerPerimetre() {
        double p = cote1 + cote2 + cote3;
        System.out.println("Perimetre du triangle = " + p);
    }
	public void calculerSurface() {
        double s = (cote1 * hauteur) / 2;
        System.out.println("Surface du triangle = " + s);
    }
	
}