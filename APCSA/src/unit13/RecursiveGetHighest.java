package unit13;

import java.util.Scanner;

public class RecursiveGetHighest {
	public static void main(String[] args) {
		int[] go = new int[8];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println("Input int for array");
			go[i] = s.nextInt();
		}
		//System.out.println("Go.len " + go.length);
		getHighest(0, go, 0);
	}

	public static void getHighest(int i, int[] go, int highest) {
		if (i == 0) {
			highest = Integer.MIN_VALUE;
		}
		//System.out.println("I:" + i);
		if (i < go.length-1) {
			if (go[i] > go[i + 1]) {
				if (go[i] > highest) {
					highest = go[i];
				}
			}
			getHighest(i + 1, go, highest);
		} else {
			if (go[i] > highest) {
				highest = go[i];
			}
			System.out.println("Highest: " +highest);
		}
	}
}
