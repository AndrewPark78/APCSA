package unit7;

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		this.number = num;

	}

	public void setNum(int num) {
		number = num;

	}

	public int greatestCommonFactor() {
		// int a, int b, int c
		int max = 0;
		for (int i = 3; i <= number; i++) {
			for (int j = 4; j <= number; j++) {
				if (i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0) {
					double ans = i * i + j * j;
					if (Math.sqrt(ans) == (int) Math.sqrt(ans)) {
						int solve = (int) Math.sqrt(ans);
						if (solve % 2 == 1) {
							if (i < j) {
								if (solve < number) {
									System.out.println(i + ", " + j + ", " + solve);
								}
							}
						}
					}

				}
			}
		}

		return 1;
	}

	public String toString() {
		String output = "";

		return output + "\n";
	}
}