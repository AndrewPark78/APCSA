package unit9;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDups {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("How many numbers you want?");
		int len = key.nextInt();
		ArrayList<Integer> hold = new ArrayList<Integer>();
		int go = 0;
		for (int i = 0; i < len; i++) {
			System.out.println("Insert 1 number");
			go = key.nextInt();
			hold.add(go);
		}
		int[] ones = new int[hold.size()];
		for (int i = 0; i < hold.size(); i++) {
			ones[i] = hold.get(i);
		}
		int[] fin = eliminateDuplicates(ones);
		String end = "";
		for(int m: fin){
			end += m;
		}
		System.out.println(end);
	}

	public static int[] eliminateDuplicates(int[] list) {
		ArrayList<Integer> hold = new ArrayList<Integer>();
		for (int i : list) {
			if (!hold.contains(i)) {
				hold.add(i);
			}
		}
		int[] ones = new int[hold.size()];
		for (int i = 0; i < hold.size(); i++) {
			ones[i] = hold.get(i);
		}
		return ones;
	}

}
