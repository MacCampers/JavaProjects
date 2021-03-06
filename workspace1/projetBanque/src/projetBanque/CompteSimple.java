package projetBanque;

public class CompteSimple {
	private String nom = "NA";
	private int solde;
	private final int cadeau = 20;
	private final int com = 1;
	private boolean credite;
	private boolean debite;
	private boolean virement;
	
	public CompteSimple(String nom, int solde) {
		this.nom = nom;
		this.solde = solde + cadeau;
	}
	
	public CompteSimple(String nom) {
		this.nom = nom;
		this.solde = cadeau;
	}
	
	public boolean crediter(int somme) {
		if (somme > 0) {
			solde += somme - com;
			credite = true;
		}
		return credite;
	}
	
	public boolean debiter(int somme) {
		if (solde >= somme + com && solde + com > 0) {
			solde -= somme + com;
			debite = true;
		}
		return debite;
	}
	
	public boolean virement(int somme, CompteSimple c) {
		debiter(100);
		c.crediter(100);
		if (credite == true && debite == true)
			virement = true;
		return virement;
	}

	public String toString() {
		return "[nom=" + nom + ", solde=" + solde + "]";
	}
	
}
