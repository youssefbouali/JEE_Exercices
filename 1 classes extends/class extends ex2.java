//Deux sous class : Personne
//->Homme
//->Femme

//Reprendre la methode d'affichage de facon
//"Je suis ..."


Class Personne {
	private String genre;
	public void setGenre(String genre){
		this.genre = genre;
	}
	public void gitGenre(){
		System.out.println(this.genre)
	}
}

Class Homme extends Personne {
	public Homme(String nom, String prenom, int age, String cin){
		super(nom, prenom, age, cin);
	}

this.String afichage(){
	return.super.afichage+"Homme";
}
}

Class Femme extends Personne {
	public Femme(String nom, String prenom, int age, String cin){
		super(nom, prenom, age, cin);
	}

this.String afichage(){
	return.super.afichage+"Femme";
}
}