package elevensArrayList;

import java.util.ArrayList;

import elevensArrayList.Card;
import elevensArrayList.Deck;

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
		final String[] ranks = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };

		/**
		 * The suits of the cards for this game to be sent to the deck.
		 */
		final String[] suits = { "spades", "hearts", "diamonds", "clubs" };

		/**
		 * The values of the cards for this game to be sent to the deck.
		 */
		final int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };

		Deck d1 = new Deck(ranks, suits, values);
		String printer = "";
		ArrayList<Card> deck = d1.getCards();
		for (int i = 0; i < deck.size(); i++) {
			printer += deck.get(i).rank() + " of " + deck.get(i).suit() + ",";
		}
		System.out.println(printer);
		deck = d1.shuffle();
		printer = "";
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
			// printer += deck[i].rank() + " of " + deck[i].suit() + ", ";
		}
		Card[] c = new Card[4];
		for (int i = 0; i < c.length; i++) {
			c[i] = d1.deal();
		}
		for(Card cur: c){
			System.out.println(cur);
		}

		// System.out.println(printer);
	}
}