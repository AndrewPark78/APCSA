package elevens;

import java.util.Arrays;

public class Permutations {
	public static void main(String[] args) {
		int[] a1 = new int[5];
		int[] a2 = new int[5];
		for (int i = 0; i < 5; i++) {
			a1[i] = i;
			a2[i] = i;
		}
		boolean b = true;
		b = arePermutations(a1, a2);
		//System.out.println(b);
		if (b == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean arePermutations(int[] a1, int[] a2) {
		boolean b = false;
		Arrays.sort(a1);
		Arrays.sort(a2);
		String s1 = "";
		String s2 = "";
		for (int i : a1) {
			s1 += i;
		}
		for (int i : a2) {
			s2 += i;
		}
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equals(s2)) {
			b = true;
		} else {
			b = false;
		}
		//System.out.println(b);
		return b;
	}
}
