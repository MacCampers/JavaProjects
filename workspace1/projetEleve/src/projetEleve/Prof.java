package projetEleve;

public class Prof {
	private String name;
	private int note;
	private Eleve[] tabEleve = new Eleve[10];

	public Prof(String name) {
		this.name = name;
	}

	public void setNote(int note) {
		this.note = note;
		notifyAll(note);
	}

	public void notifyAll(int note) {
		for (Eleve e : tabEleve) {
			if (e != null)
				e.notif();
		}
	}

	public void setEleve(Eleve[] tabEleve) {
		this.tabEleve = tabEleve;
	}

	public void setUniqueEleve(Eleve e) {
		for (int i = 0; i < tabEleve.length; i++) {
			if (this.tabEleve[i] == null)
				this.tabEleve[i] = e;
		}
	}

	public int getNote() {
		return note;
	}
}
