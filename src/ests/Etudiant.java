package ests;

public abstract class Etudiant  extends ESTien{
	private String section;
	public Etudiant(String a,int b,String c) {
		super(a,b);
		section=c;
	}
	@Override
	public void afficher () {
		super.afficher();
		System.out.println("section:"+section);
	}
}
