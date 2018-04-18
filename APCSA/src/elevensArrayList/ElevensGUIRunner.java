package elevensArrayList;
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Andrew Park -- Period 4 -- 3.28.18 -- Computer number 08 but I use mine");
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}