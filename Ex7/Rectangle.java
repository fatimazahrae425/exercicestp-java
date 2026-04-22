package Ex7;

public class Rectangle extends Forme {
	
	double largeur, longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public double calculerSurface() {
        return largeur * longueur;
    }
    public void calculerPerimetre() {
        double p = 2 * (largeur + longueur);
        System.out.println("Perimetre du Rectangle: " + p);
    }
    public void validerDimensions() {
        if (largeur > 0 && longueur > 0) {
            System.out.println("Dimensions valides");
        } else {
            System.out.println("Dimensions invalides");
        }
    }

}
