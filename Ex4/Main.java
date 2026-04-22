package Ex4;

public class Main {
	public static void main(String[] args) {
		Animal monChien = new Chien();
		System.out.println("Test pour le Chien");
        monChien.crier();
        monChien.manger();
        monChien.dormir(); 
        
        System.out.println("Test pour le Chat ");
        Animal monChat = new Chat();
        monChat.crier();
        monChat.manger();
        monChat.dormir();
   
	}

}