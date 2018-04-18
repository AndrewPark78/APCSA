package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze {
	private int[][] maze;

	public Maze() {

	}

	public Maze(int size, String line) {
		maze = new int[size][size];
		// System.out.println(line);
		String holdChar = "";
		int counter = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				holdChar += line.charAt(counter);
				maze[i][j] = Integer.parseInt(holdChar);
				counter += 2;
				holdChar = "";
			}
		}

	}

	public boolean hasExitPath(int r, int c, boolean exitFound) {
		System.out.println("R = " + r);
		System.out.println("C = " + c);
		System.out.println();
		//System.out.println(maze.length);
		//System.out.println();
		if (r < maze.length && r >= 0 && c < maze.length && c >= 0 && maze[r][c] == 1) {
			maze[r][c] = -1;
			if (r == maze.length - 1) {
				System.out.println(r);
				System.out.println(maze.length-1);
				exitFound = true;
				return exitFound;
			} else {
				if (maze[r + 1][c] == 1) {
					exitFound = hasExitPath(r + 1, c, exitFound);
				} else if (maze[r][c + 1] == 1) {
					exitFound = hasExitPath(r, c + 1, exitFound);
				} else if (maze[r][c - 1] == 1) {
					exitFound = hasExitPath(r, c - 1, exitFound);
				} else if (maze[r - 1][c] == 1) {
					exitFound = hasExitPath(r - 1, c, exitFound);
				}

			}
		}
		if (r == maze.length - 1){
			return exitFound;
		}else{
		return exitFound;
		}
	}


	public String toString() {
		String output = "";
		for (int row = 0; row < maze.length; row++) {
			output = "";
			for (int col = 0; col < maze[row].length; col++) {
				output += maze[row][col];
			}
			System.out.println(output);
		}
		return output;
	}
}