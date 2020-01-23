package model;

public abstract class Vehicule {
	private String marque;
	private int prix;

	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}
	
	public String avancer() {
		return "j'avance vehicule";
	}
	
	public abstract String demarrer();

	public String toString() {
		return "Vehicule [marque=" + marque + ", prix=" + prix + "]";
	}

}