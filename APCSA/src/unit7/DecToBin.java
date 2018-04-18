package unit7;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a number 0-255");
		int i = c.nextInt();
		String bin = "";
		for (int j = 7; j >= 0; j--) {
			if(i - (Math.pow(2, j)) >= 0){
				bin += "1";
				i = (int) (i - (Math.pow(2, j)));
			}else{
				bin += "0";
			}
		}
		System.out.println(bin);
	}
}