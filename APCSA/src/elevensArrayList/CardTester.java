package elevensArrayList;

import elevensArrayList.Card;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("J", "Heart", 10);
		Card c2 = new Card("J", "Clubs", 10);
		Card c3 = new Card("5", "Spades", 5);
		System.out.println(c3.pointValue());
		System.out.println(c1.matches(c2));
	}
}