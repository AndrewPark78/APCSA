package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
public class Grades {
	private double[] grades;

	public Grades() {
		setGrades("");
	}

	public Grades(String gradeList) {
		setGrades(gradeList);
	}
	public double[] getGrades(){
		return grades;
	}
	public void setGrades(String gradeList) {
		char c = gradeList.charAt(0);
		String temp = "";
		temp += c;
		int x = Integer.parseInt(temp);
		int co = 4;
		String[] s = new String[x];
		String st = "";
		for (int i = 0; i < x; i++) {
			st = "";

			while (gradeList.charAt(co) != 32) {
				// System.out.println(gradeList.charAt(co));
				st += gradeList.charAt(co);
				co++;
				if (co == gradeList.length()) {
					co = 1;
				}
			}

			co++;
			// System.out.println(st);
			s[i] = st;
			
		}
		double[] end = new double[x];
//		int count = 0;
//		for (String h : s) {
//
//			if (s[x-1].equals(h)) {
//				System.out.println("Last"+ h);
//			}
//			System.out.println(h);
//			end[count] = Double.parseDouble(h);
//			count++;
//		}
//		System.out.println(s.length + " LEN");
		int last = end.length-1;
		for (int i = 0; i < end.length; i++) {
		//	System.out.println(s[i]);
//			if(i == last){
//				s.set(i, s.get(i).substring(0, s.get(i).length()-1));
//			//	System.out.println(s[i] + "cfjgbefu");
//			}
			end[i] = Double.parseDouble(s[i]);
		}
		grades = end;
	}

	public void setGrade(int spot, double grade) {
		grades[spot] = grade;
	}

	public double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < low) {
				low = grades[i];
			}
		}
		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > high) {
				high = grades[i];
			}
		}
		return high;
	}

	public int getNumGrades() {
		return grades.length;
	}

	public String toString() {
		String output = "";
		for(double i: grades){
			output += i + ", ";
		}
		return output;
	}
}