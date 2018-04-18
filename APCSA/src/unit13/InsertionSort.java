package unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort {
	private ArrayList<String> list = new ArrayList<String>();

	public InsertionSort() {

	}

	// modfiers
	public void add(String word) {
		int loc = 0;
		boolean b = false;
		if (list.size() == 0) {
			list.add(word);
		} else {
			outerloop: for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < word.length(); j++) {
					if (list.get(i).length() == j) {
						b = true;
						break outerloop;
					}
					if (word.charAt(j) < list.get(i).charAt(j)) {

						loc = i;
						break outerloop;
					}
				}
			}
			if (b) {
				list.add(word);
			} else {
				list.add(loc, word);
			}
		}
	}

	public void remove(String word) {
		int x = 0;
		boolean b = false;
		for (String s : list) {
			if (s.equals(word)) {
				x = list.indexOf(s);
				b = true;
			}
		}
		if (b) {
			list.remove(x);
		}
	}

	public String toString() {
		String s = "";
		for (String m : list) {
			s += m + " ";
		}
		return s;
	}
}