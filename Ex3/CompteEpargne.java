package Ex3;

public class CompteEpargne extends Compte {
	
	double tauxInteret;
	
	public CompteEpargne(double solde, double tauxInteret) {
		super(solde);
        this.tauxInteret = tauxInteret;
	}
	public void calculerInterets() {
		double gains = solde * tauxInteret;
        System.out.println("Les interets sont de: " + gains + " DH");
	}
	
	 public void ajouterInterets() {
		 double gains = solde * tauxInteret;
	     solde = solde + gains;
	     System.out.println("Interets ajoutes au solde");
	 }
	 
	 public void afficher() {
		 System.out.println("Compte Epargne");
	     System.out.println("Solde: " + solde + " DH");
	     System.out.println("Taux d'interet: " + (tauxInteret * 100) + "%");
	 }
	
}