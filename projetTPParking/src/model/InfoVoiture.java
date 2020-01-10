package model;

public class InfoVoiture {
	private String matricule;
	private String marque;

	public String getMatricule() {
		return matricule;
	}

	public String getMarque() {
		return marque;
	}

	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}

	public String toString() {
		return "InfoVoiture [matricule=" + matricule + ", marque=" + marque + "]";
	}
}
