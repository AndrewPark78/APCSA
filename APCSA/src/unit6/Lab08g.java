package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats t = new LoopStats();
		t.setNums(1, 5);
		System.out.println(t.toString());
		System.out.println("Total: " + t.getTotal());
		System.out.println("Odds: " + t.getOddCount());
		System.out.println("Evens: " + t.getEvenCount());
		t.setNums(5, 94);
		System.out.println(t.toString());
		System.out.println("Total: " + t.getTotal());
		System.out.println("Odds: " + t.getOddCount());
		System.out.println("Evens: " + t.getEvenCount());
		
		
					
	}
}