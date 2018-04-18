package unit14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i {
	public static void main(String args[]) throws IOException {
		ArrayList<String> read = new ArrayList<String>();
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit14/lab21i.dat"));
			while (file.hasNextLine()) {
				read.add(file.nextLine());
			}
		} catch (Exception e) {
			out.println("err" + e);
		}
		int counter = 0;
		int loopCount = 0;
		while (loopCount < read.size()) {
			Maze m = new Maze(Integer.parseInt(read.get(counter)), read.get(counter + 1));
			counter += 2;
			System.out.println(m.toString());
			System.out.println();
			if (m.hasExitPath(0, 0, false) == true) {
				System.out.println("Has a path");
			} else {
				System.out.println("Has no path");
			}
			System.out.println();
			System.out.println();
			loopCount +=2;
		}
	}
}