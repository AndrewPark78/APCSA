package elevensArrayList;

import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call to
	 * each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 9;

	/**
	 * Tests shuffling methods.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = { 0, 1, 2, 3, 4, 5, 6, 7};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values1 = perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values2 = selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
	 * splits the deck in half, then interleaves the cards in one half with the
	 * cards in the other.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static int[] perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int k = 0;
		int[] shuffled = new int[values.length];
		for (int i = 0; i < (values.length + 1) / 2; i++) {
			shuffled[k] = values[i];
			k = k + 2;
		}
		k = 1;
		for (int j = (values.length + 1) / 2; j < values.length; j++) {
			shuffled[k] = values[j];
			k = k + 2;
		}
		values = shuffled;
		return values;
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument. The selection
	 * shuffle algorithm conceptually maintains two sequences of cards: the
	 * selected cards (initially empty) and the not-yet-selected cards
	 * (initially the entire deck). It repeatedly does the following until all
	 * cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards. An efficient version of this
	 * algorithm makes use of arrays to avoid searching for an as-yet-unselected
	 * card.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static int[] selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int k = 0;
		int[] shuffled = new int[values.length];
		ArrayList<Integer> hold = new ArrayList<Integer>();
		boolean b = true;
		for (int j = 0; j < shuffled.length; j++) {
			shuffled[j] = -1;
		}
		int counter = 0;
		while (b == true) {
			int x = (int) Math.floor(Math.random() * (values.length));
			if (!hold.contains(x)) {
				for (int i = 0; i < shuffled.length; i++) {
					// System.out.println("cur shuf " + shuffled[i]);
					if (shuffled[i] == -1) {
						shuffled[i] = values[x];
						break;
					}
				}
				hold.add(x);
			}
			for (int m : shuffled) {
				if (m != -1) {
					b = false;
				} else {
					b = true;
				}
			}
			counter++;
		}
		values = shuffled;
		return values;
	}
	public ArrayList<Card> cardShuffle(ArrayList<Card> unshuffled){
		
		int r = 0;
		for (int k = 51; k >= 1; k--) {
			r = (int) Math.floor(Math.random() * (unshuffled.size()));
			Card temp = unshuffled.get(k);
			unshuffled.set(k, unshuffled.get(r));
			unshuffled.set(r, temp);
		}
		return unshuffled;
	}
}