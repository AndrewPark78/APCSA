package unit5;

import java.util.Random;

public class VehiclePlate {
	public static void main(String[] args) {
		Random rand = new Random();
		String plate = "";
		char a = 'h';
		int randomNum = 0;
		for (int i = 0; i < 3; i++) {
			randomNum = rand.nextInt((90 - 65) + 1) + 65;
			a = (char) randomNum;
			plate += a;
		} 
		for (int i = 0; i < 4; i++) {
			randomNum = rand.nextInt((57-48) + 1) + 48;
			a = (char) randomNum;
			plate += a;
		} 
		System.out.println(plate);
	}
}
