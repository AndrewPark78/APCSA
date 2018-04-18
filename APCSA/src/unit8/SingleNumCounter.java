package unit8;

import java.util.ArrayList;

public class SingleNumCounter {
	ArrayList<Integer> zero = new ArrayList<Integer>();
	ArrayList<Integer> one = new ArrayList<Integer>();
	ArrayList<Integer> two = new ArrayList<Integer>();
	ArrayList<Integer> three = new ArrayList<Integer>();
	ArrayList<Integer> four = new ArrayList<Integer>();
	ArrayList<Integer> five = new ArrayList<Integer>();
	ArrayList<Integer> six = new ArrayList<Integer>();
	ArrayList<Integer> seven = new ArrayList<Integer>();
	ArrayList<Integer> eight = new ArrayList<Integer>();
	ArrayList<Integer> nine = new ArrayList<Integer>();
	public static void main(String[] args) {
		int num = 0;
		SingleNumCounter snc = new SingleNumCounter();
		for (int i = 0; i < 100; i++) {
			num = 0 + (int) (Math.random() * ((9 - 0) + 1));
			snc.counter(num);
		}
		System.out.println("zero: " + snc.zero.size());
		System.out.println("one: " + snc.one.size());
		System.out.println("two: " + snc.two.size());
		System.out.println("three: " + snc.three.size());
		System.out.println("four: " + snc.four.size());
		System.out.println("five: " + snc.five.size());
		System.out.println("six: " + snc.six.size());
		System.out.println("seven: " + snc.seven.size());
		System.out.println("eight: " + snc.eight.size());
		System.out.println("nine: " + snc.nine.size());
	}public void counter(int m){
		if(m==0){
			zero.add(m);
		}else if(m == 1){
			one.add(m);
		}else if(m == 2){
			two.add(m);
		}else if(m == 3){
			three.add(m);
		}else if(m == 4){
			four.add(m);
		}else if(m == 5){
			five.add(m);
		}else if(m == 6){
			six.add(m);
		}else if(m == 7){
			seven.add(m);
		}else if(m == 8){
			eight.add(m);
		}else if(m == 9){
			nine.add(m);
		}
	}
}
