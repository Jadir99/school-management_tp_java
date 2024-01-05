package ests;

public final class secretaire extends Employe {

	public secretaire(String a,int b,String c,int d) {
		super( a, b, c, d);
	}
	public void afficher() {
		System.out.println("secretaire:");
		super.afficher();
	}
	
	
}
