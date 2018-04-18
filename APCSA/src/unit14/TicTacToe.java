package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe {
	private char[][] mat;

	public TicTacToe() {

	}

	public TicTacToe(String game) {
		mat = new char[3][3];
		//System.out.println(game);
		
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = game.charAt(counter);
				counter++;
			}
		}

	}

	public String getWinner() {
		boolean XW = false;
		boolean OW = false;
		String output = "";
		for (int row = 0; row < mat.length; row++) {
			output = "";
			for (int col = 0; col < mat[row].length; col++) {
				output += mat[row][col];
			}
			if(output.equals("XXX")){
				return "X Wins";
			}else if(output.equals("OOO")){
				return "O Wins";
			}
		}
		for (int row = 0; row < mat.length; row++) {
			output = "";
			for (int col = 0; col < mat[row].length; col++) {
				output += mat[col][row];
			}
			if(output.equals("XXX")){
				return "X Wins";
			}else if(output.equals("OOO")){
				return "O Wins";
			}
		}
		output = "";
		output += mat[0][0];
		output += mat[1][1];
		output += mat[2][2];
		if(output.equals("XXX")){
			return "X Wins";
		}else if(output.equals("OOO")){
			return "O Wins";
		}
		output = "";
		output += mat[0][2];
		output += mat[1][1];
		output += mat[2][0];
		if(output.equals("XXX")){
			return "X Wins";
		}else if(output.equals("OOO")){
			return "O Wins";
		}
		return "Draw";
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
		System.out.println(getWinner());

		return output + "\n\n";
	}
}