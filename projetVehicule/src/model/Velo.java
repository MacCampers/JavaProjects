package model;

public class Velo extends Vehicule {

	public Velo(String marque, int prix) {
		super(marque, prix);
	}

	public String demarrer() {
		return "velo démarrée";
	}

	public String avancer() {
		return "Je roule à deux roues";
	}

}
