package EST;

public class Etransferer extends Etudiant {
	
	private String univer;
	
	public Etransferer(String nom,String sec,int nbr,String uni) {
		super(nom ,sec,nbr);
		univer =uni;
	}
	public void afficher () {
		System.out.println("Etudiant Transferer:");
		super.afficher();
		System.out.println("   l'universite:"+univer);
	}
}
