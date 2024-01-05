package ests;

public final class ensegnement extends Employe{
	private String sec ;
	
	public ensegnement(String a,int b,String c,int d,String e) {
		super( a, b, c, d);
		sec=e;
	}
	
	public void afficher () {
		System.out.println("Ensignement :");
		super.afficher();
		System.out.println("section"+sec);
	}
	

}
