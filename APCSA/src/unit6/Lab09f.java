package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover lr = new LetterRemover();
		lr.setRemover("hi hi hi", 'h');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters());
		lr.setRemover("I am unchangable", 'z');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters());
		
											
	}
}