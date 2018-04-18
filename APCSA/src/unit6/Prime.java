//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Prime {
	private int number;

	public Prime() {

	}

	public Prime(int num) {
		this.number = num;

	}

	public void setPrime(int num) {
		number = num;

	}

	public boolean isPrime() {
		int i, m = 0, flag = 0;
		int n = number;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
			return false;
			
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					return false;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
				return true;
			}
		} // end of else
		return false;
	}

	public String toString() {
		String output = "";
		if (isPrime()) {
			output = "The number is " + number + ". It is prime.";
		} else {
			output = "The number is " + number + ". It is not prime.";
		}
		return output;
	}
}