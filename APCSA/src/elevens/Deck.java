package elevens;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	// private List<Card> cards;

	// Unit 9 - Array version of the Deck
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits, and produces
	 * one of the corresponding card.
	 * 
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int counter = 0;
		size = ranks.length * suits.length;
		cards = new Card[size];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards[counter] = new Card(ranks[j], suits[i], values[j]);
				counter++;
			}

		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * 
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		boolean b = false;
		if (size() == 0) {
			b = true;
		}
		return b;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * 
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public Card[] shuffle(Card[] unshuffled) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		Shuffler s = new Shuffler();
		Card[] shuffledCards = new Card[unshuffled.length];
		shuffledCards = s.cardShuffle(unshuffled);

		size = unshuffled.length;
		return shuffledCards;
	}

	/**
	 * Deals a card from this deck.
	 * 
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int num = 0;
		if (!isEmpty()) {
			return cards[size];
		}
		size = size - 1;
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * 
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		// Unit 9 - modify to work with Arrays

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}