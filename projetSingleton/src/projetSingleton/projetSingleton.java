package projetSingleton;

public class projetSingleton {

	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// Personne p1 = new Personne();
		// Personne p2 = new Personne();
		// Personne[] pers = { p1, p2 };
		// for (Personne a : pers)
		// System.out.println(a);
	}
}
