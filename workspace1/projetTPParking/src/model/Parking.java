package model;

import java.util.Arrays;

public class Parking {
	private String nom;
	private Voitures[] tab;
	
	public Parking(String nom, Voitures[] voiture) {
		this.nom = nom;
		this.tab = voiture;
	}
	
	public boolean Add(Voitures voiture) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = voiture;
				tab[i].setVitesse(0);
				res = true;
				break;
			}
		}
		return res;
	}
	
	public boolean Remove(String matricule) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getinfoVoiture().getMatricule().equalsIgnoreCase(matricule)) {
				tab[i] = null;
				res = true;
				break;
			}
		}
		return res;
	}
	
	public int getCount() {
		int count = 0;
		for (Voitures v: tab) {
			if (v != null)
				count++;
		}
		return count;
	}

	public int getCountByMarque(String marque) {
		int count = 0;
		for (Voitures v: tab) {
			if (v != null && v.getinfoVoiture().getMarque().equalsIgnoreCase(marque))
				count++;
		}
		return count;
	}

	public String toString() {
		String str = "Parking [nom=" + nom + ",";
		for (Voitures p : tab) {
			if (p != null)
				str += "\n" + p;
		}
		str += "]";
		return str;
	}
}
