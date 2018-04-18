package unit12;

import static java.lang.System.*;

public class Word implements Comparable<Word> {
	private String word;

	public Word(String s) {
		this.word = s;

	}

	public int compareTo(Word rhs) {
		if (this.word.length() > rhs.word.length()) {
			return 1;
		} else if (this.word.length() < rhs.word.length()) {
			return -1;
		} else if (this.word.length() == rhs.word.length()) {
			for (int i = 0; i < this.word.length(); i++) {
				if (this.word.toLowerCase().charAt(i) > rhs.word.toLowerCase().charAt(i)) {
					return 1;
				} else if (this.word.toLowerCase().charAt(i) < rhs.word.toLowerCase().charAt(i)) {
					return -1;
				}
			}
		}

		return 0;
	}

	public String toString() {
		return word;
	}
}