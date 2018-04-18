package unit9;

import java.util.ArrayList;

public class MyString1 {
	char[] chars;

	public MyString1(char[] chars) {
		this.chars = chars;
	}

	public char charAt(int index) {
		char c = '\0';
		c = chars[index];
		return c;
	}

	public int length() {
		int i = 0;
		for (char c : chars) {
			i++;
		}
		return i;
	}

	public MyString1 subString(int begin, int end) {
		ArrayList<Character> hold = new ArrayList<Character>();
		for (int i = begin; i < end; i++) {
			hold.add(chars[i]);
		}
		char[] m = new char[hold.size()];
		for (int i = 0; i < m.length; i++) {
			m[i] = hold.get(i);
		}
		MyString1 mn = new MyString1(m);
		return mn;
	}

	public MyString1 toLowerCase() {
		String x = chars.toString();
		x = x.toLowerCase();
		char[] hi = x.toCharArray();
		MyString1 mn = new MyString1(hi);
		return mn;
	}
	public boolean equals(MyString1 s){
		boolean b = true;
		for (int i = 0; i < chars.length; i++) {
			if(s.charAt(i) != chars[i]){
				b = false;
			}
		}
		return b;
	}
	public MyString1 valueOf(int i){
		char c = chars[i];
		char[] x = new char[c];
		MyString1 mn = new MyString1(x);
		return mn;
	}


}
