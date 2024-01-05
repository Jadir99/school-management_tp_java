package ests;

public abstract class Employe extends ESTien {
	private String labo;
	private int salaire;
	
	public Employe (String a,int b,String c,int d) {
		super( a, b);
		labo=c;
		salaire =d;
	}
	public void afficher() {
		super.afficher();
		System.out.println("laboratoire :"+labo);
		System.out.println("salaire:"+salaire);
	}
}
