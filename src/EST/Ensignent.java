package EST;

public class  Ensignent extends employe {
	private String section;
	
	public Ensignent(String nom,double slr,String lab,int nbr,String sec) {
		super(nom,slr,lab, nbr);
		section =sec;
	}
	public void afficher() {
		System.out.println("L'ensignent:");
		super.afficher();
		System.out.println("   section:"+ section);
	}
	
}
