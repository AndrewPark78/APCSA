package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord {
	private char[][] mat;
	String s;

	public FancyWord() {

	}

	public FancyWord(String s) {
		this.s = s;
		mat = new char[s.length()][s.length()];
		int size = s.length();
		int counter = 0;

		for (int row = 0; row < mat.length; row++) {

			for (int col = 0; col < mat[row].length; col++) {
				mat[row][col] = ' ';
			}

		}
		for (int lineNum = 0; lineNum < mat.length; lineNum++) {
			for (int index = lineNum; index < size; index++) {

				mat[lineNum][lineNum] = s.charAt(lineNum);

				mat[lineNum][s.length() - 1 - lineNum] = s.charAt(s.length() - 1 - lineNum);

			}
		}
		for (int index = 0; index < size; index++) {
			mat[0][index] = s.charAt(index);
			mat[size-1][index] = s.charAt(index);
		}
	}

	public String toString() {
		String output = "";
		
		for (int row = 0; row < mat.length; row++) {
			output = "";
			for (int col = 0; col < mat[row].length; col++) {
				output += mat[row][col];
			}
			System.out.println(output);
		}

		return output + "\n\n";
	}
}