package Ex3;

public class CompteCourant extends Compte {
	 boolean autoriseDecouverte;
	 
	 public CompteCourant(double solde, boolean autoriseDecouverte) {
		 super(solde);
	     this.autoriseDecouverte = autoriseDecouverte;
	 }
	 public void autoriserDecouvert() {
		 this.autoriseDecouverte = true;
		 System.out.println("Decouvert autorise");
	 }
	 public void calculerFrais() {
		 solde = solde - 5;
	     System.out.println("Frais de 5 DH deduits");
	 }
	 public void afficher() {
		 System.out.println("Compte Courant");
	     System.out.println("Solde: " + solde);
	     System.out.println("Decouvert autorise: " + autoriseDecouverte);
	 }
}

