package unit10;

public class MyInteger {
	int value;

	public static void main(String[] args) {
		char[] c = new char[3];
		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		int x = parseInt("123");
		System.out.println(x);
	}

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 0; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		for (int i = 0; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {
		if (value.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger value) {
		if (value.getValue() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(MyInteger value) {
		for (int i = 0; i < value.getValue() / 2; i++) {
			if (value.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int i) {
		if (this.getValue() == i) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger value) {
		if (this.getValue() == value.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	public static int parseInt(char[] c) {
		int x = 0;
		for (char car : c) {
			x += (int) car;
		}
		return x;
	}
	public static int parseInt(String s) {
		int x = 0;
		char c = '\0';
		for (int i = 0; i < s.length(); i++){
			c = s.charAt(i);
			x += (int) c;
		}
		return x;
	}
}
