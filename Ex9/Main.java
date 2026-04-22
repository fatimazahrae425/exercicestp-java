package Ex9;

	public class Main {
	    public static void main(String[] args) {
	        
	        System.out.println("Test voiture electrique");
	        VoitureElectrique ve = new VoitureElectrique();
	        ve.demarrer();          
	        ve.accelerer();
	        ve.charger();
	        ve.verifierBatterie();
	        ve.afficherAutonomie();
	        ve.optimiserConsommation(); 

	        System.out.println(" Test moto");
	        Moto m = new Moto();
	        m.demarrer();
	        m.accelerer(); 
	        m.freiner();  
	        m.faireRoueArriere(); 
	        m.afficherTypeMoto();  
	    }
	}
