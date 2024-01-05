package ests;

public final class E_tran extends Etudiant{

	private String universite;
	
	public E_tran(String a,int b,String c,String d) {
		super(a, b, c);
		universite=d;
	}
	public void afficher () {
		System.out.println("Etudiant transfirer:");
		super.afficher();
		System.out.println("Uneversite:"+universite);
	}
}
