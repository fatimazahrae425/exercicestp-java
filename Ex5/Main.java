package Ex5;

public class Main {
	public static void main(String[] args) {
		System.out.println("Test cercle");
		Figure f1 = new Cercle(9.0);
		f1.dessiner();
        f1.deplacer(5, 20);
        
        ((Cercle) f1).calculerPerimetre();
        ((Cercle) f1).calculerSurface();
        

        System.out.println("\nTest triangle");
   
        Figure f2 = new Triangle(7, 7, 4, 5);
        
        f2.dessiner();
        f2.redimensionner(4.0);
        
        ((Triangle) f2).calculerPerimetre();
        ((Triangle) f2).calculerSurface();
        
	}

}