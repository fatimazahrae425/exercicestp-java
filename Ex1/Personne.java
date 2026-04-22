package Ex1;

public class Personne {
    String nom;
    String prenom;
    int age;

    
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age);
    }

    public boolean estMajeur() {
        return age >= 18;
    }

    public String sePresenter() {
    	return "je m'appelle " + prenom + " " + nom + " et j'ai "+ age + "ans.";
	
    }
}


