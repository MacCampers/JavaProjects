package model;

import javax.persistence.Embeddable;

@Embeddable
public class Coordonnees {
	private String addresse, tel;

	public Coordonnees(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}