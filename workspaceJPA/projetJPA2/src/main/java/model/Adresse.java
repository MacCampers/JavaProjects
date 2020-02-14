package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String rue;
	private int num, cp;

	/**
	 * @param rue
	 * @param num
	 * @param cp
	 */
	public Adresse(String rue, int num, int cp) {
		this.rue = rue;
		this.num = num;
		this.cp = cp;
	}

	public Adresse() {
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

}