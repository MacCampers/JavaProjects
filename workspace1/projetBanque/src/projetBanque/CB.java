package projetBanque;

public enum CB {
	Amex(5),
	MC(10),
	Visa(15);
	
	private int num;
	
	CB(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}
