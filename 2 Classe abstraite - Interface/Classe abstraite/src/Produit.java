package Ex1;

public abstract class Produit {
	private String nom;
	private float prixUnitaire;
	
	public Produit(String nom, float prixUnitaire) {
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
	}

	public String getNom() {
		return nom;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	
	abstract void calculePrix();
}
