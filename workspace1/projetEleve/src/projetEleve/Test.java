package projetEleve;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		Eleve e1 = new Eleve("test3");
		Eleve e2 = new Eleve("test3");
		Prof p = new Prof("testProf");
		p.setUniqueEleve(e1);
		p.setUniqueEleve(e2);
		e1.setProf(p);
		e2.setProf(p);
		p.setNote(18);
		System.out.println(e1);

//		Eleve[] e = {new Eleve("test1"), new Eleve("test2")};
//		for(Eleve a: e)
//		a.setProf(p);
//	p.setEleve(e);
//		for(Eleve a: e)
//			System.out.println(a);
		
	}

}
