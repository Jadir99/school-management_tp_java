package EST;

public abstract class estien {

	private String nom ;
	private int annee;
	
	public estien (String n,int a){
		nom =n;
		annee=a;
	}
	
	public void afficher () {
		System.out.println(	"   le nome  :"+ nom );
		System.out.println(	"   l'anne :"+ annee);
	}
	
}
