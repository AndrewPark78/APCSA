package unit7;

import static java.lang.System.*;

public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
	}

	public TriangleThree(int count, String let) {
		this.size = count;
		this.letter = let;
	}

	public void setTriangle(int sz, String let) {
		size = sz;
		letter = let;
	}

	public String getLetter() {
		return letter;
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < size; i++) {
			for (int j = size; j > i+1; j--) {
				output += " ";
			}
			for (int k = 0; k < i+1; k++) {
				output += letter;
			}
			System.out.println(output);
			output = "";
		}
		return output + "\n";
	}
}