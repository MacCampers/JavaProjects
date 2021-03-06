package projectStatic;

public class Personne {
	private static String nom = "Dupond";
	private String prenom;
	private static final int ageMin = 0;
	private static int compteur;

	public Personne(String prenom) {
		this.prenom = prenom;
		compteur++;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static void setNom(String nom) {
		Personne.nom = nom;
	}
	
	public static int getCompteur() {
		return compteur;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
