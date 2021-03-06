package model;

public class Salarie {
	private int id;
	private String nom;
	private String prenom;
	private Rib rib;
	private Status status;

	public Salarie(int id, String nom, String prenom, Rib rib, int experience) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rib = rib;
		this.status = new Status(experience);
	}

	public Salarie(int id, String nom, String prenom, Rib rib) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rib = rib;
	}

	public Salarie(int id, String nom, String prenom, int experience) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.status = new Status(experience);
	}

	public Salarie(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String toString() {
		String str = "Salarie [id=" + id + ", nom=" + nom + ", prenom=" + prenom;
		str += (rib != null) ? ", rib=" + rib + "]" : "";
		str += (status != null) ? ", status=" + status + "]" : "";
		str += (rib != null && status != null) ? " ]" : "";
		return str;
	}

}
