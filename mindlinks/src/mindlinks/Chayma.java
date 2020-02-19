package mindlinks;

public class Chayma {
	String nom ; 
	int age ; 
	public Chayma (String nom , int age) {
		this.nom = nom ;
		this.age = age ;
	}
	public void affiche(String nom , int age) {
		System.out.println("votre nom est : "+nom+"\n votre age est : "+age);
	}
}
