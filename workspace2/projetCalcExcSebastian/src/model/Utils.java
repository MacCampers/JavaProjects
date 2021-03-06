package model;

public abstract class Utils {

	public static String choixCalc(double a, double b, String op)
			throws NegException, OpException, ArithmeticException {
		if (a < 0 || b < 0)
			throw new NegException("Valeur n�gative d�tect�e", a, b);
		switch (op) {
		case "":
			throw new OpException("Op�rateur non renseign�", op);
		case "+":
		case "add":
			return (a + " + " + b + " = " + calcSomme(a, b));
		case "-":
		case "sous":
			return (a + " - " + b + " = " + calcSous(a, b));
		case "*":
		case "mult":
			return (a + " * " + b + " = " + calcMult(a, b));
		case "/":
		case "div":
			return (a + "/" + b + " = " + calcDiv(a, b));
		default:
			throw new OpException("Op�rateur inconnu", op);
		}
	}

	private static double calcSomme(double a, double b) {
		return a + b;
	}

	private static double calcSous(double a, double b) {
		return a - b;
	}

	private static double calcMult(double a, double b) {
		return a * b;
	}

	private static double calcDiv(double a, double b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException("On a dit, PAS DE DIVISION PAR 0!!!!!");
		return a / b;
	}

	public static int inc(String s) throws ConvException {
		int res = 0;
		try {
			res = Integer.parseInt(s) + 1;
		} catch (Exception e) {
			throw new ConvException(e.getMessage(), "ahah");
		}
		return res;
	}
}
