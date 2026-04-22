package Ex1;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Test Personne ");
        Personne p = new Personne("Dupont", "Emma", 20);
        p.afficherInformations();
        System.out.println("estmajeur : " + p.estMajeur()); 
        System.out.println(p.sePresenter()); 

        System.out.println("Test Etudiant ");   
        Etudiant e = new Etudiant("Emma", "Dupon", 20, "ID1", 15.5);
           
        e.afficherProfil(); 
        
        System.out.println("Admis : " + e.estAdmis()); 
        System.out.println("Mention obtenue : " + e.calculerMention());
    }
}