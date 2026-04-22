package Ex5;

public class Figure {
	int x, y;
	
	public void dessiner() {
        System.out.println("Dessin d'une figure aux positions (" + x + ", " + y + ")");
    }
	public void deplacer(int nx, int ny) {
        x = nx;
        y = ny;
        System.out.println("La figure est deplacee vers: (" + x + ", " + y + ")");
    }
	public void redimensionner(double facteur) {
        System.out.println("La figure est redimensionnee avec un facteur de: " + facteur);
    }
}