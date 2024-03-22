package Ex2;

public class Article implements Document {
	
	private String titre;
	private String auteurs;
	private double journal;

	public Article(String titre, String auteurs, double journal) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.journal = journal;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(String auteurs) {
		this.auteurs = auteurs;
	}

	public double getJournal() {
		return journal;
	}

	public void setJournal(double journal) {
		this.journal = journal;
	}

	@Override
	public void afficherDetails() {
		System.out.println("Le titre : " +titre);
		System.out.println("Les auteurs : " +auteurs);
		System.out.println("Le journal : " +journal);
	}

	@Override
	public void emprunter() {
		String user;
		
		
	}

	@Override
	public void retourner() {
		
	}

}
