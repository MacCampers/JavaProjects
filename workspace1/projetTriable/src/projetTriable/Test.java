package projetTriable;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		testArticleParPrix();
	}
	
	static void testArticleParPrix() {
		Article[] tab = {
			new Article("xx", 10),
			new Article("yy", 5),
			new Article("zz", 20),
			new Article("aa", 15)
		};
		for (Article a: tab)
			System.out.println(a);
		Arrays.sort(tab, new ComparePrix());
		System.out.println("*************");
		for (Article a: tab)
			System.out.println(a);
	}
	
	static void testArticlev1() {
		Article[] tab = {
			new Article("xx", 10),
			new Article("yy", 5),
			new Article("zz", 20),
			new Article("aa", 15)
		};
		for (Article a: tab)
			System.out.println(a);
		Arrays.sort(tab, new CompareMarque());
		System.out.println("*************");
		for (Article a: tab)
			System.out.println(a);
	}

	static void testString() {
		String[] str = { "aa", "bbb", "ccc", "ddd" };
		affiche(str);
		Arrays.sort(str);
		affiche(str);
	}

	static void testInt() {
		int[] tab = { 2, 1, 6, 5, 9, 8 };
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);
	}
	
	static void testPersonne() {
		Personne[] tab = {
				new Personne("aa", "bb", 10),
				new Personne("cc", "ee", 30),
				new Personne("dd", "rr", 20)
		};
		affiche(tab);
		Arrays.sort(tab, Personne.PersonneNameComparator);
		affiche(tab);
	}

	static void affiche(int[] tab) {
		for (int e : tab)
			System.out.println(e + " ");
		System.out.println();
	}

	static void affiche(String[] tab) {
		for (String e : tab)
			System.out.println(e + " ");
		System.out.println();
	}

	static void affiche(Personne[] tab) {
		for (Personne e : tab)
			System.out.println(e + " ");
		System.out.println();
	}
}
