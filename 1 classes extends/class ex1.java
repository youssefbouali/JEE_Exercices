//Créer une class Personne avec attrebutes
//nom : chaine de caractères
//prenom : chaine de caractères
//cin : chaine de caractères
//age : entier
//

//Deux constructeurs(L'un vide l'autre pour initialisé toutes les atributs)
//les accesseurs et mutateurs
//Une méthode qui va afficher le nom de chaque personne



Class Personne {
	public String nom;
	public String prenom;
	public String cin;
	public String age;

public Personne (String nom, String prenom, String cin, int age) {
	this.nom = nom;
	this.personne = personne;
	this.cin = cin;
	this.age = age;
}

public void Personne (){
	
}

public void setNom (String nom){
	this.nom = nom;
}

public void getNom (){
	return this.nom;
}

public String afficher (){
	return ("nom est"+this.nom);
}

}