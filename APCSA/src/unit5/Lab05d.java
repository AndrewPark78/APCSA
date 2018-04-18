package unit5;

import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		test.setChar(letter);
		System.out.println(test);   //A

		System.out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter2);
		test2.setChar(letter2);  
		System.out.println(test2);
		
		System.out.print("Enter a letter :: ");
		char letter3 = keyboard.next().charAt(0);
		CharacterAnalyzer test3 = new CharacterAnalyzer(letter3);
		test3.setChar(letter3);
		System.out.println(test3);
		//add more test cases
		
		
		
		
		
		
		
		

	}
}