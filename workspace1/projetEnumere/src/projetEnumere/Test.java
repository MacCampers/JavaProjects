package projetEnumere;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// testSemaine();
		// testCivilité();
		testFormationv4();
	}
	
	public static void testFormationv4() {
		Scanner sc = new Scanner(System.in);
		Formation[] tab = Formation.values();
		System.out.println("choisir parmis la liste");
		for(Formation f: tab)
			System.out.print(f.name() + "\t");
		String choix = sc.nextLine();
		Formation f = Formation.valueOf(choix);
		System.out.println(f);
	}
	
	public static void testFormationv3() {
		Formation f = Formation.java;
		System.out.println(f.toString());
		System.out.println(f.name());
	}
	
	public static void testFormationv2() {
		Formation f = Formation.java;
		System.out.println(f.getPrix());
		System.out.println(Formation.python + "\t" + Formation.python.getLieu() + "\t" + Formation.python.getPrix());
	}
	
	public static void testFormationv1() {
		System.out.println(Formation.java);
		Formation f = Formation.python;
		System.out.println(f.toString());
		System.out.println(f.name());
	}
	
	public static void testSemaine() {
		System.out.println(Semaine.we);
	}
	
	public static void testCivilité() {
		System.out.println(Civilite.mr + " Dupond");
		
		Civilite mrbis = Civilite.mr;
		String str = Civilite.mr.toString();
		String str2 = Civilite.mr + "";
	}

}
