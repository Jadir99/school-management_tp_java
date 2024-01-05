package ests;

public final class E_regu extends Etudiant {
	
	private int moyenne;
	
	public E_regu(String a,int b,String c,int d) {
		super(a, b, c);
		moyenne=d;
	}
	@Override
	public void afficher () {
		System.out.println("Etudiant regulier:");
		super.afficher();
		System.out.println("moyenne:"+moyenne);
	}
}
