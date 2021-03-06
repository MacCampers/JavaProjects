package projetGeneric;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		test6();
	}

	static void test6() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Personne> al2 = new ArrayList<Personne>();
	}
	
	static void test5() {
		Traitement<Object> t = new Traitement<Object>();
		Traitement t2 = new Traitement();

	}
	
	static void test4() {
		Traitement<Personne> t = new Traitement<Personne>();
		Personne p = new Personne("aaa", "bbb");
		t.setA(p);
		Personne p2 = t.getA();
		
		Traitement<Integer> t2 = new Traitement<Integer>();
		t2.setA(10);
		int a = t2.getA();
	}

	static void test3() {
		Traitement t = new Traitement();
		Personne p = new Personne("aaa", "bbb");
		t.setA(p);
		System.out.println(t.getA());
		
		Personne p2 = (Personne) t.getA();
		System.out.println(p2.getNom());
	}

	static void test2() {
		Traitement t1 = new Traitement();
		t1.setA(10);
		System.out.println(t1.getA());

		t1.setA("test");
		System.out.println(t1.getA());

		Personne p = new Personne("aaa", "bbb");
		t1.setA(p);
		System.out.println(t1.getA());
	}

	static void test1() {
		Traitement t1 = new Traitement();
		t1.setA(10);
		System.out.println(t1.getA());

		Traitement t2 = new Traitement();
		t2.setA("test");
		System.out.println(t2.getA());

		Personne p = new Personne("aaa", "bbb");
		Traitement t3 = new Traitement();
		t3.setA(p);
		System.out.println(t3.getA());
	}
}
