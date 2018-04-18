package unit7;

import java.util.ArrayList;
import java.util.Stack;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalin(4893478));
	}

	public boolean isPalin(int in) {
		boolean b = false;
		int i = reverse(in);
		if(i == in){
			b = true;
		}
		System.out.println(in);
		System.out.println(i);
		return b;
	}

	public int reverse(int go) {
		int out = 0;
		ArrayList<Character> a = new ArrayList<Character>();
		Stack x = new Stack();
		String s = "";
		String flipped = "";
		s += go;
		for (int i = 0; i < s.length(); i++) {
			a.add(s.charAt(i));
		}
		for (char c : a) {
			x.push(c);
		}
		for (int i = 0; i < s.length(); i++) {
			flipped += x.pop();
		}
		out = Integer.parseInt(flipped);
		return out;
	}
}
