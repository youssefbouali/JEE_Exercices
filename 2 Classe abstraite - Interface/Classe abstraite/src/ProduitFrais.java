package Ex1;

public class ProduitFrais extends Produit  {
	
	private double prixRefrigiration;
	
	public ProduitFrais(String nom, float prixUnitaire, double prixRefrigiration) {
		super(nom, prixUnitaire);
		this.prixRefrigiration = prixRefrigiration;	
	}

	public double getPrixRefrigiration() {
		return prixRefrigiration;
	}

	@Override
	void calculePrix() {
		double prix;
		prixRefrigiration = getPrixUnitaire() * 0.1;
		prix = prixRefrigiration + getPrixUnitaire();
		System.out.println("Votre prix total est : " +prix);
	}

}
