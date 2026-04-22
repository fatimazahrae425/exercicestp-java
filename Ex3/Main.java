package Ex3;

public class Main {
	public static void main(String[] args) {
		CompteCourant cc = new CompteCourant(5000, false);
		cc.deposer(600);
        cc.calculerFrais();
        cc.afficher(); 
        
        CompteEpargne ce = new CompteEpargne(4000, 0.05);
        ce.ajouterInterets();
        ce.afficher();
	}

}
