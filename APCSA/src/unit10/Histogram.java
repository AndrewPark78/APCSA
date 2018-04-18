package unit10;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static java.lang.System.*;

public class Histogram {
	private ArrayList<Integer> count = new ArrayList<Integer>();
	private ArrayList<Character> letters;
	private String fileName;
	private ArrayList<String> read = new ArrayList<String>();

	public Histogram() {

	}

	public Histogram(char[] values, String fName) {
		this.fileName = fName;
		letters = new ArrayList<Character>();
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit10/" + fileName));
			while (file.hasNextLine()) {
				read.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println("err" + e);
		}
		for(char c: letters){
			count.add(0);
		}
		for (String s : read) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < letters.size(); j++) {
					if (s.charAt(i) == letters.get(j)) {
						int value = count.get(j); // get value
						value = value + 1; // increment value
						count.set(j, value);
					}
				}
			}
		}
	}

	public char mostFrequent() {
		int high = 0;
		for(int x: count){
			if(x > high){
				high = x;
			}
		}
		return letters.get(count.indexOf(high));
	}

	public char leastFrequent() {
		int low = count.get(0);
		for(int x: count){
			if(x < low){
				low = x;
			}
		}
		return letters.get(count.indexOf(low));
	}

	public String toString() {
		return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}