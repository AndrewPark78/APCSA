package unit14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b {
	public static void main(String args[]) throws IOException {
		ArrayList<String> read = new ArrayList<String>();
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit14/lab24b.dat"));
			while (file.hasNextLine()) {
				read.add(file.nextLine());
			}
		} catch (Exception e) {
			out.println("err" + e);
		}
		for (int i = 1; i <= Integer.parseInt(read.get(0)); i++) {
			FancyWord f = new FancyWord(read.get(i));
			f.toString();
		}

	}
}
