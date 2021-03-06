package model;

import java.util.Arrays;

public class Groupe {
	private String nom;
	private Personne[] tab;
	private boolean res;

	public Groupe(String nom, int taille) {
		this.nom = nom;
		tab = new Personne[taille];
	}

	public boolean add(Personne p) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = p;
				res = true;
				break;
			}
		}
		return res;
	}

	public boolean remove(int id) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getId() == id) {
				tab[i] = null;
				res = true;
				break;
			}
		}
		return res;
	}

	public int getCount() {
		int count = 0;
		for (Personne p : tab) {
			if (p != null)
				count++;
		}
		return count;
	}

	public int getCount(String nom) {
		int count = 0;
		for (Personne p : tab) {
			if (p != null && p.getNom().equalsIgnoreCase(nom))
				count++;
		}
		return count;
	}

	public String toString() {
		String str = "Groupe [nom=" + nom + ",";
		for (Personne p : tab) {
			if (p != null)
				str += "\n" + p;
		}
		str += "]";
		return str;
	}

}
