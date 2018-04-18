package Lab16d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib {
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private ArrayList<String> story = new ArrayList<String>();

	public MadLib() {

	}

	public MadLib(String fileName) {
		// load stuff
		verbs = new ArrayList<String>();
		loadVerbs();
		nouns = new ArrayList<String>();
		loadNouns();
		adjectives = new ArrayList<String>();
		loadAdjectives();
		fileName = System.getProperty("user.dir") + "/src/Lab16d/nouns.dat";
		try {
			Scanner file = new Scanner(new File(fileName));

		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadNouns() {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/Lab16d/nouns.dat"));
			while (file.hasNextLine()) {
				nouns.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println(e);
		}

	}

	public void loadVerbs() {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/Lab16d/verbs.dat"));
			while (file.hasNextLine()) {
				verbs.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println(e);
		}

	}

	public void loadStory() {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/Lab16d/story.dat"));
			while (file.hasNextLine()) {
				story.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println(e);
		}

	}

	public void loadAdjectives() {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/Lab16d/adjectives.dat"));
			while (file.hasNextLine()) {
				adjectives.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println(e);
		}

	}

	public String getRandomVerb() {
		Random rand = new Random();
		int n = rand.nextInt(verbs.size());
		String s = verbs.get(n);
		return s;
	}

	public String getRandomNoun() {
		Random rand = new Random();
		int n = rand.nextInt(nouns.size());
		String s = nouns.get(n);
		return s;
	}

	public String getRandomAdjective() {
		Random rand = new Random();
		int n = rand.nextInt(adjectives.size());
		String s = adjectives.get(n);
		return s;
	}

	public String toString() {
		loadStory();
		int x = story.get(0).length();
		String s = story.get(0);
		char c = '\0';
		String m = "";
		String fin = "";
		for (int i = 0; i < x; i++) {
			c = s.charAt(i);
			m = "";
			m += c;
			if (m.equals("#")) {
				fin += getRandomNoun();
			}else if(m.equals("@")){
				fin += getRandomVerb();
			}else if(m.equals("&")){
				fin += getRandomAdjective();
			}else{
				fin += m;
			}
			// System.out.println(s);
		}
		return fin;
	}
}