package Ex2;

public class Livre implements Document {
	
	private String titre;
	private String auteur;
	private double anneePublication;

	public Livre(String titre, String auteur, double anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getAnneePublication() {
		return anneePublication;
	}

	public void setAnneePublication(double anneePublication) {
		this.anneePublication = anneePublication;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Le titre : " +titre);
		System.out.println("L'auteur : " +auteur);
		System.out.println("L'anne de publication : " +anneePublication);
	}

	@Override
	public void emprunter() {
		String user;
		
	}

	@Override
	public void retourner() {
		
	}

}
