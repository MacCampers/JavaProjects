package model;

public class Bateau extends Vehicule {
	private Ebateau ebateau;

	public Bateau(String marque, int prix, Ebateau ebateau) {
		super(marque, prix);
		this.ebateau = ebateau;
	}

	public String avancer() {
		return "Je flotte";
	}

	public String demarrer() {
		return "bateau démarrée";
	}

}