package Ex7;

public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(8, 10);
        Cercle c = new Cercle(4);
        
        r.afficherDescription();
        System.out.println("Surface Rectangle: " + r.calculerSurface());
        r.validerDimensions();
        
        c.afficherDescription();
        System.out.println("Surface Cercle: " + c.calculerSurface());
        
        r.comparerSurface(c);
	}

}
