package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	
	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom + "]";
		response += (this.adresse != null) ? "\nadresse=" + adresse : "";
		return response;
	}

	public Adresse getAdresse() {
		return adresse;
	}
}
