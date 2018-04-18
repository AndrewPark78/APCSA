package unit13;

public class Check6by6 {
	int[][] matrix = new int[6][6];

	public static void main(String[] args) {
		Check6by6 sixer = new Check6by6();
		for (int row = 0; row < sixer.matrix.length; row++) {
			for (int col = 0; col < sixer.matrix[row].length; col++) {
				int num = 0 + (int) (Math.random() * ((1 - 0) + 1));
				sixer.matrix[row][col] = num;
			}
		}
		String s = "";
		char[] c;
		int x = 0;
		for (int row = 0; row < sixer.matrix.length; row++) {
			s = "";
			x = 0;
			for (int col = 0; col < sixer.matrix[row].length; col++) {
				s += sixer.matrix[row][col];
			}
			System.out.println(s);
			c = s.toCharArray();
			for (char m : c) {
				if (m == '1') {
					x += 1;
				}
			}
			if (x % 2 == 0) {
				System.out.println("Row " + (row + 1) + " is even");
			} else {
				System.out.println("Row " + (row + 1) + " is odd");
			}
		}
	}

	public int checkPos(int r, int c) {
		return matrix[r][c];
	}
}
