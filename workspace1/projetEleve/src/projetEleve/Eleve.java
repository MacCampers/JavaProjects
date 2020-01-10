package projetEleve;

public class Eleve {
	private String name;
	private int note;
	private Prof prof;
	
	public Eleve(String name) {
		this.name = name;
	}
	
	public void notif() {
		this.note = prof.getNote();
	}

	public int getNote() {
		return note;
	}
	
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	

	public String toString() {
		return "Eleve [name=" + name + ", note=" + note + "]";
	}

}
