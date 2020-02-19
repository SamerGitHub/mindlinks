package mindlinks;

public class Etudiant    {
public class Etudiant extends Personne  {

public int numCarteEtudiant;
public Etudiant(String nom ,String prenom ,int age,int numCarteEtudiant)
{
	super(nom,prenom,age);
	this.numCarteEtudiant=numCarteEtudiant ;
	
}



}


