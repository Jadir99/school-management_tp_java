package EST;

public  class employe extends estien{

	
	

	private String labo_inst ;
	private double salaire ;
	
	public employe(String nom,double slr,String lab,int nbr){
		super(nom ,nbr);
		labo_inst =lab;
		salaire =slr;
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("   le salaire :"+ salaire);
		System.out.println("   le salire :"+ salaire);
	}
}

