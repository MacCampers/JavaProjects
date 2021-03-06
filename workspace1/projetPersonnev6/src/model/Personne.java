package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private Info info;

	public Info getInfo() {
		return info;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Personne(String nom, String prenom, int poid, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = new Info(poid, taille);
	}

	public Personne(String nom, String prenom, Adresse adresse, int poid, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.info = new Info(poid, taille);
	}

	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom + "]";
		response += (this.adresse != null) ? "\nadresse=" + adresse : "";
		response += (this.info != null) ? "\ninfo=" + info : "";
		return response;
	}

	public Adresse getAdresse() {
		return adresse;
	}
}
