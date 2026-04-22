package Ex1;

public class Etudiant extends Personne {
    String niveau;
    double moyenne;

    
    public Etudiant(String nom, String prenom, int age, String niveau, double moyenne) {
        super(nom, prenom, age); 
        this.niveau = niveau;
        this.moyenne = moyenne;
    }

    public String calculerMention() {
        if (moyenne >= 16) return "Très Bien";
        else if (moyenne >= 14) return "Bien";
        else if (moyenne >= 12) return "Assez Bien";
        else if (moyenne >= 10) return "Passable";
        else return "Ajourné";
    }

    public boolean estAdmis() {
        return moyenne >= 10;
    }

    public void afficherProfil() {
        afficherInformations(); 
        System.out.println("Niveau: " + niveau + ", Moyenne: " + moyenne);
        System.out.println("Mention: " + calculerMention());
    }
}