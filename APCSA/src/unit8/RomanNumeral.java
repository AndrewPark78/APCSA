package unit8;

import static java.lang.System.*;

import java.util.Arrays;

public class RomanNumeral {
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanNumeral(String str) {
		this.roman = str;

	}

	public RomanNumeral(Integer orig) {
		this.number = orig;

	}

	public void setNumber(Integer num) {
		number = num;
		roman = "";
	}

	public void setRoman(String rom) {
		roman = rom;
		number = 0;
	}

	public Integer getNumber() {
		return number;
	}

	public String toString() {
		String cur = "";
		int hold = number;
		int x = hold;
		int stop = 0;
		// System.out.println("Hello");
		if (number != 0) {
			// System.out.println("Hi");
			for (int i = 0; i < LETTERS.length; i++) {
				stop = NUMBERS[i];
				while (hold > stop) {
					if (i + 1 <= 12) {
						cur += LETTERS[i];
						hold -= NUMBERS[i];
						// System.out.println("Cur 1 " + cur);
					} else {
						cur += LETTERS[i];
						hold -= NUMBERS[i];
						// System.out.println("Cur 2 " + cur);
					}
				}
				if (hold == NUMBERS[i]) {
					// System.out.println("num @ i " + NUMBERS[i]);
					// System.out.println("hold " + hold);
					if (hold == 1) {
						cur += LETTERS[12];
						// System.out.println("one");
						break;
					} else {
						cur += LETTERS[i];
						hold -= NUMBERS[i];
					}
				}
			}
			// System.out.println("cur " + cur);
			roman = cur;
			return roman + "\n";
		} else {
			int numb = 0;
			String left = roman;
			for (int i = 0; i < LETTERS.length; i++) {
				if (left.length() > 1) {
					// if (Arrays.asList(LETTERS).contains(roman.substring(i, i
					// + 1))) {
					// System.out.println(LETTERS[i]);
					// System.out.println(left.substring(0, 2));
					if (LETTERS[i].equals(left.substring(0, 2))) {
						left = left.substring(2);
						// System.out.println(numb);
						numb += NUMBERS[i];
						// System.out.println("Double rom " + left);
						// System.out.println(numb);
					}
					// else if
					// (Arrays.asList(LETTERS).contains(roman.substring(0, 1)))
					// {
					else if (LETTERS[i].equals(left.substring(0, 1))) {
						while (LETTERS[i].equals(left.substring(0, 1))) {
							left = left.substring(1);
							numb += NUMBERS[i];
							// System.out.println("Single rom " + left);
							// System.out.println(numb);
							if (left.length() == 0) {
								break;
							}
						}
					}
				} else {
					int l = 0;
					for (int j = 0; j < LETTERS.length; j++) {
						if (LETTERS[j].equals(left)) {
							numb += NUMBERS[j];
							// System.out.println("Only 1");
							break;
						}
					}
				}

			}
			String fin = "";
			fin += numb;
			return fin;
		}

	}
}