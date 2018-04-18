package elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suits = new String[] { "Spades", "Clubs", "Hearts", "Diamonds" };
		int[] values = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1 };
		Deck d1 = new Deck(ranks, suits, values);
		String printer = "";
		Card[] deck = d1.getCards();
		for (int i = 0; i < deck.length; i++) {
			printer += deck[i].rank() + " of " + deck[i].suit() + ",";
		}
		 System.out.println(printer);
		deck = d1.shuffle(deck);
		printer = "";
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
			//printer += deck[i].rank() + " of " + deck[i].suit() + ", ";
		}
			
		//System.out.println(printer);
	}
}