package projetTriable;

import java.util.Comparator;

public class ComparePrix implements Comparator<Article>  {
	public int compare(Article arg0, Article arg1) {
		return ((Integer)arg0.getPrix()).compareTo(arg1.getPrix());
	}
}
