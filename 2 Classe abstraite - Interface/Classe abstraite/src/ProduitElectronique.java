package Ex1;

public class ProduitElectronique extends Produit {
	
	private double garantie;
	double Qte;
	
	public ProduitElectronique(String nom, float prixUnitaire, double garantie, double Qte) {
		super(nom, prixUnitaire);
		this.garantie = garantie;
	}

	public double getGarantie() {
		return garantie;
	}

	@Override
	void calculePrix() {
		double prix;
		prix = (getPrixUnitaire()* Qte) + garantie;
		System.out.println("Votre prix est : " +prix);
	}
		
}
