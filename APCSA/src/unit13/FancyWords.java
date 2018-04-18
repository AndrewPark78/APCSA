package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

import static java.lang.System.*;

public class FancyWords {
	private String[] wordRay;

	public FancyWords(String sentence) {
		int counter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				counter++;
			}
		}
		counter ++;
		wordRay = new String[counter];
		String word = "";
		int cur = 0;
		for (int i = 0; i < counter; i++) {
			while (sentence.charAt(cur) != ' ') {
				word += sentence.charAt(cur);
				cur++;
			}
			cur++;
			wordRay[i] = word;
			word = "";
		}
	}
	public FancyWords() {
		// TODO Auto-generated constructor stub
	}
	public int getLen(){
		return wordRay.length;
	}
	public void getSen(){
		for(String s: wordRay){
			System.out.println(s);
		}
	}
	public void setWords(String sentence) {
		int counter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				counter++;
			}
		}
		counter++;
		wordRay = new String[counter];
		String word = "";
		int cur = 0;
		for (int i = 0; i < counter; i++) {
			while (sentence.charAt(cur) != ' ') {
				word += sentence.charAt(cur);
				cur++;
				if(cur == sentence.length()){
					break;
				}
			}
			cur++;
			wordRay[i] = word;
			word = "";
		}
	}

	public String toString() {
		String output = "";
		int max = Integer.MIN_VALUE;
		for (String s : wordRay) {
			if (s.length() > max) {
				max = s.length();
			}
		}
		String[] fancy = new String[max];
		String parts = "";
		for (int i = 0; i < max ; i++) {
			for (int j = wordRay.length-1; j >= 0; j--) {
				try {
					parts += wordRay[j].charAt(i);
				} catch (ArrayIndexOutOfBoundsException e) {
					parts += " ";
				} catch (StringIndexOutOfBoundsException e){
					parts += " ";
				}
			}
			fancy[i] = parts;
			parts = "";
		}
		for (int i = fancy.length-1; i >=0; i--) {
			System.out.println(fancy[i]);
		}
		return output + "\n\n";
	}
}