package model;

public class Voitures {
	private int vitesse;
	public final int vitesseMin = 0;
	public final int vitesseMax = 300;
	public final int vitesseFlash = 120;
	private int flash = 0;
	private InfoProprio infoProprio;
	private InfoVoiture infoVoiture;

	public Voitures(int vitesse, InfoProprio proprio, String matricule, String marque) {
		this.vitesse = vitesse;
		this.infoProprio = proprio;
		this.infoVoiture = new InfoVoiture(matricule, marque);
	}

	public void setVitesse(int vitesse) {
		if (vitesse >= vitesseMin && vitesse < vitesseMax) {
			if (this.vitesse < vitesseFlash && vitesse > vitesseFlash)
				this.flash++;
			this.vitesse = vitesse;
		}
	}

	public InfoVoiture getinfoVoiture() {
		return infoVoiture;
	}

	public int getFlash() {
		return this.flash;
	}

	public String toString() {
		String response = "\tVoiture [vitesse=" + vitesse + "]";
		response += (this.infoProprio != null) ? "\tinfoProprio=" + infoProprio : "";
		response += (this.infoVoiture != null) ? "\tinfoVoiture=" + infoVoiture : "";
		return response;
	}
}
