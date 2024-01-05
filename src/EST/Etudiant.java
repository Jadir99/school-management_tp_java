package EST;

public class  Etudiant extends estien {
	
	private String section;
	public Etudiant (String nom,String sec,int nbr) {
		super(nom ,nbr);
		section =sec;
	}
	public void afficher () {
		super.afficher();
		System.out.println("   Section:"+ section);
	}
}
