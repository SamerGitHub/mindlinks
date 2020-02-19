package mindlinks;

public class Rectangle {
public float longueur;
public float largeur ;
Rectangle(float largeur,float longueur)
{
	this.longueur=longueur;
	this.largeur=largeur;
	
}
public float surface(float largeur,float longueur)
{
	return largeur*longueur;
}
}
