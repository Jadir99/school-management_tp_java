package EST;

public class   secretaire extends employe{
	
	public secretaire(String a,int b,String c,int d) {
		super(a,b,c,d);
	}
	public void afficher () {
		System.out.println("Secretaire:");
		super.afficher();
	}
}
