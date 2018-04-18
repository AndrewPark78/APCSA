package unit14;

import static java.lang.System.*;

public class Lab21g {
	public static void main(String args[]) {
		// instantiate an AtCounter
		AtCounter ac = new AtCounter();
		ac.countAts(0, 0);
		ac.getAtCount();
		System.out.println(ac.toString());
		// test the code
		AtCounter ac1 = new AtCounter();
		ac1.countAts(2, 5);
		ac1.getAtCount();
		System.out.println(ac1.toString());
		AtCounter ac2 = new AtCounter();
		ac2.countAts(5, 0);
		ac2.getAtCount();
		System.out.println(ac2.toString());
	}
}