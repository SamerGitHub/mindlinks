package mindlinks;

public class Lamia extends Personne {
	public String etat ;
	 public Lamia (String nom , String prenom , int age , String etat)
	 {
		 super(nom,prenom,age);
		 this.etat=etat;
	 }
	 
	public String getEtat()
	{
		return etat;
	}
	public void setEtat(String e)
	{
		etat=e;
	}

}
