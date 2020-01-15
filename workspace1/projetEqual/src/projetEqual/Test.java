package projetEqual;

public class Test {

	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	static void test2() {
		Personne p1 = new Personne("aaaa", "bbbb", 20);
		Personne p2 = new Personne("bbbb", "eeee", 85);
		Personne p3 = p1;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
	
	static void test1() {
		Personne p1 = new Personne("aaaa", "bbbb", 20);
		Personne p2 = p1;
		Personne p3 = new Personne("bbbb", "eeee", 85);
		
		if (p1.equals(p2))
			System.out.println("ok");
		else
			System.out.println("ko");
	}

}
