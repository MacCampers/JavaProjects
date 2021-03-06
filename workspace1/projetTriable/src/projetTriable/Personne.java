package projetTriable;

import java.util.Comparator;

public class Personne implements Comparable<Personne> {
	private String nom;
	private String prennom;
	private int age;

	public Personne(String nom, String prennom, int age) {
		this.nom = nom;
		this.prennom = prennom;
		this.age = age;
	}

	public int compareTo(Personne comparePersonne) {
		int compareQuantity = ((Personne) comparePersonne).getAge();
		return this.age - compareQuantity;
	}

	public static Comparator<Personne> PersonneNameComparator = new Comparator<Personne>() {

		public int compare(Personne p1, Personne p2) {

			String PName1 = p1.getNom().toUpperCase();
			String PName2 = p2.getNom().toUpperCase();
			return PName1.compareTo(PName2);
		}

	};

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrennom() {
		return prennom;
	}

	public void setPrennom(String prennom) {
		this.prennom = prennom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prennom=" + prennom + ", age=" + age + "]";
	}
}
