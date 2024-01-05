package EST;

public class Eregulier extends Etudiant{
	private double note ;
	
	public Eregulier (String nom,int nbr,double not,String sec) {
		super(nom ,sec,nbr);
		note=not;
	}
	public void afficher () {
		System.out.println("Etudiant Regulier:");
		super.afficher();
		System.out.println("   la moyenne:"+ note);
	}
}
