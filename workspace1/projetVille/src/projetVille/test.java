package projetVille;

import java.util.Random;
import model.Villes;

public class test {
	public static void main(String[] args) {
		projetVille();
	}
	
	static void projetVille() {
		Random r = new Random();
		Villes v1 = new Villes("Lyon", "Paris", r.nextInt(10), "France");
		System.out.println(v1.toString());
		v1.setNbHabitants(1);
		System.out.println(v1.toString());
		Villes v2 = new Villes("Paris", "Paris", r.nextInt(10), "France");
		System.out.println(v2.toString());
	}
}
