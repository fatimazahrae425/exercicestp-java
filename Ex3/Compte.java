package Ex3;

public class Compte {
	double solde;
	public Compte( double solde) {
		this.solde=solde;
	}
	public void deposer(double montant) {
		solde = solde + montant;
	}
	public void retirer(double montant) {
		if (solde >= montant) {
			solde = solde - montant;
			System.out.println("Retrait de: " + montant);
		}
		else {
			 System.out.println("Solde insuffisant !");
		}
	}
	public void consulterSolde() {
		 System.out.println("Solde actuel: " + solde);
	}
	
	 public void afficher() {
		 System.out.println("Compte Standard - Solde: " + solde);
	 }
}