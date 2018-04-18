package unit11LabAssesment;

import static java.lang.System.out;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class OneThousandMonkeys {
	static ArrayList<String> dictionary = new ArrayList<String>();
	public static void main(String[] args) {
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit11LabAssesment/google-10000-english.txt"));
			while (file.hasNextLine()) {
				dictionary.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println("err" + e);
		}
		Essay e = new Essay();
		e = getNextEssay();
		e.setName("Andrew Park");
		e.setPeriod(4);
		System.out.println(e.toString());
	}
	public static Word getNextWord(){
		int num = 0 + (int) (Math.random() * ((dictionary.size()-1 - 0) + 1));
		Word w = new Word(dictionary.get(num));
		return w;
	}
	public static Sentence getNextSentence(){
		int num = 5 + (int) (Math.random() * ((15 - 5) + 1));
		Sentence s = new Sentence();
		for (int i = 0; i < num; i++) {
			s.addWord(getNextWord());
		}
		return s;
	}
	public static Paragraph getNextParagraph(){
		int num = 3 + (int) (Math.random() * ((8 - 3) + 1));
		Paragraph p = new Paragraph();
		for (int i = 0; i < num; i++) {
			p.addSentence(getNextSentence());
		}
		return p;
	}
	public static Essay getNextEssay(){
		int num = 4 + (int) (Math.random() * ((6 - 4) + 1));
		Essay e = new Essay();
		for (int i = 0; i < num; i++) {
			e.addParagraph(getNextParagraph());
		}
		return e;
	}
}
