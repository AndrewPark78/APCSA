package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame {
	private int upperBound;

	public GuessingGame(int stop) {

	}

	public void playGame() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers");
		upperBound = keyboard.nextInt();
		double uB = upperBound + 0.0;
		System.out.println("Enter a number between 1 and " + upperBound);
		int guess = keyboard.nextInt();
		int num = 1 + (int) (Math.random() * ((uB - 1) + 1));
		int counter = 1;
		while (guess != num) {
			counter ++;
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();	
		}
		System.out.println("It took you "+ counter + " guesses to guess " + num);
		double per = (counter-1);
		double meh = per/counter;
		double cent = meh*100;
		System.out.println("You guessed wrong " + cent + "% of the time;");

	}

	public String toString() {
		String output = "";
		return output;
	}
}