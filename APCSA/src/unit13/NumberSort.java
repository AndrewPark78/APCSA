package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;
		String s = "";
		s += number;
		count = s.length();
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number % 10;
			number = number / 10;
		}
		 for (int i = 0; i < sorted.length; i++) {
		        for (int j = i + 1; j < sorted.length; j++) {
		            int tmp = 0;
		            if (sorted[i] > sorted[j]) {
		                tmp = sorted[i];
		                sorted[i] = sorted[j];
		                sorted[j] = tmp;
		            }
		        }
		    }
		 return sorted;
	}
}