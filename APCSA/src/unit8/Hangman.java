package unit8;

import java.util.ArrayList;
import java.util.Scanner;

import unit7.GuessingGame;

public class Hangman {
	String[] words = { "write", "that", "program", "jazz", "hello", "music" };

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's play hangman!");
		Hangman h = new Hangman();
		boolean b = true;
		while (b) {
			h.runGame();
			System.out.println("Should we play another? (y or n)");
			String s = keyboard.next();
			if (s.equals("y")) {
				b = true;
			} else {
				b = false;
			}
		}
	}

	public void runGame() {
		Scanner key = new Scanner(System.in);
		String curGuess = "";
		int num = 0 + (int) (Math.random() * ((5 - 0) + 1));
		char c = '\0';
		char x = '\0';
		int counter = 0;
		int guesses = 0;
		ArrayList<Character> hold = new ArrayList<Character>();
		ArrayList<Character> hold2 = new ArrayList<Character>();
		char[] chars;
		String word = "";
		String help = "";
		String complete = words[num];
		int place = 0;
		for (int i = 0; i < complete.length(); i++) {
			word += "*";
			help += "*";
			hold.add(complete.charAt(i));
		}
		//System.out.println(complete);
		//System.out.println(hold);
		hold2 = hold;
		chars = word.toCharArray();
		while (!word.equals(complete)) {
			System.out.println("Your word is " + word + ".");
			System.out.println("Guess a letter. Case does not matter.");
			curGuess = key.next();
			curGuess = curGuess.toLowerCase();
			c = curGuess.charAt(0);
			for (int i = 0; i < chars.length; i++) {
				x = hold.get(i);
				// System.out.println(x + " and " + c);
				if (x == c) {

					place = hold.indexOf(x);
					chars[place] = c;
					// System.out.println(chars);
					hold.remove(place);
					hold.add(place, '*');
				}
			}
			word = "";
			for (char next : chars) {
				word += next;
			}if (help.equals(word)) {
				counter++;
				System.out.println(curGuess + " is not in the word");
			}
			help = "";
			for (char next : chars) {
				help += next;
			}
			guesses++;
		}System.out.println("It took you " + guesses + " guesses to get the word.");
		System.out.println("You guessed wrong " + counter + " times.");

	}
}
