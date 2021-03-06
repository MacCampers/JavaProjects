package projectInterface;

public class Test {

	public static void main(String[] args) {
//		test1();
//		test2();
		test4();
	}

	public static void test4() {
		B b1 = new B();
		b1.mB();
		I3 i3 = b1;
		I2 i2 = i3;		
	}

	public static void test1() {
		A a1 = new A();
		a1.m1();
		a1.mA();

		I1 a2 = a1;
		a2.m1();

		I2 a3 = a1;
		a3.m2();
	}

	public static void test2() {
		// casting
		I1 a1 = new A();
		a1.m1();
		A ma = (A) a1;
		ma.mA();

		I2 a2 = new A();
	}

	public static void test3() {
		I1[] tab = { new A(), new B() };
		for (I1 i : tab)
			i.m1();
		A a = (A) tab[0];
		B b = (B) tab[1];
	}

}
