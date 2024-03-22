package Ex2;

public class Magazine implements Document {
	
	private String titre;
	private String categorie;
	private double numero;

	public Magazine(String titre, String categorie, double numero) {
		this.titre = titre;
		this.categorie = categorie;
		this.numero = numero;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public double getAnneePublication() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Le titre : " +titre);
		System.out.println("L'auteur : " +categorie);
		System.out.println("Le numero : " +numero);
	}

	@Override
	public void emprunter() {
		String user;
		
		
	}

	@Override
	public void retourner() {
		
	}

}
