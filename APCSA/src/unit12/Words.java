package unit12;

import static java.lang.System.*;

import java.util.ArrayList;

public class Words implements Comparable<Words> {
	private String word;

	public Words(String s) {
		this.word = s;

	}

	private int numVowels() {
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.size(); j++) {
				if (word.charAt(i) == vowels.get(j)) {
					vowelCount ++;
				}
			}
		}

		return vowelCount;
	}

	public int compareTo(Words rhs) {
		if(this.numVowels() > rhs.numVowels()){
			return 1;
		}else if(this.numVowels() < rhs.numVowels()){
			return -1;
		}else if (this.numVowels() == rhs.numVowels()) {
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