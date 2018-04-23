package pixLabs;

public class CountX {
	public int countX(String str) {
		int count;
		char[] chars = str.toCharArray();
		if (chars.length == 1) {
			if (chars[0] == 'x') {
				return 1;
			} else {
				return 0;
			}
		} else {
			char[] next = str.substring(1, str.length() - 1).toCharArray();
			if (chars[0] == 'x') {
				return 1 + countX(next.toString());
			}else{
				return 0 + countX(next.toString());
			}
		}
	}
}
