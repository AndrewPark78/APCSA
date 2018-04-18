package unit13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d {
	public static void main(String args[]) throws IOException {
		ArrayList<String> words = new ArrayList<String>();
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit13/lab15d.dat"));
			while (file.hasNextLine()) {
				words.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println("err" + e);
		}
		// System.out.println(words.get(0));
		for(String s: words){
			System.out.println(s);
		}
		ArrayList<FancyWords> allWords = new ArrayList<FancyWords>();
		for (int i = 1; i <= Integer.parseInt(words.get(0)); i++) {
			FancyWords fw = new FancyWords();
			fw.setWords((words.get(i)));
			allWords.add(fw);
		}
		System.out.println(allWords.get(0).getLen());
		allWords.get(0).getSen();
		System.out.println(allWords.get(1).getLen());
		allWords.get(1).getSen();
		System.out.println(allWords.get(2).getLen());
		allWords.get(2).getSen();
		System.out.println(allWords.get(0).toString());
		System.out.println(allWords.get(1).toString());
		System.out.println(allWords.get(2).toString());

	}
}