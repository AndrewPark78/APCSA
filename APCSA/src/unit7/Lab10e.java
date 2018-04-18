package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char response;
		System.out.println("Let's play a guessing game. Enter any number to continue");
		int i = keyboard.nextInt();
		GuessingGame g = new GuessingGame(i);
		boolean b = true;
		while (b) {
			g.playGame();
			System.out.println("Should we play another? (y or n)");
			String s = keyboard.next();
			if(s.equals("y")){
				b = true;
			}else{
				b = false;
			}
		}

	}
}