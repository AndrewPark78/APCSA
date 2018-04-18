package unit8;
import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int numGrades;
	private String grades;
	double[] nums;

	//constructor
	Grades(){
		
	}
	Grades(int numGrades, String grades){
		this.numGrades = numGrades;
		this.grades = grades;
		int mark = 0;
		int count = 0;
		String s = "";
		for (int i = 0; i < grades.length(); i++) {
			if(grades.charAt(i) == ' '){
				count ++;
			}
		}
		nums = new double[count];
		count = 0;
		for (int i = 0; i < grades.length(); i++) {
			if(grades.charAt(i) == ' '){
				s = grades.substring(mark, i);
				nums[count] = Double.parseDouble(s);
				mark = i;
				count++;
			}
		}
		//System.out.println(Arrays.toString(nums));
	}


	//set method
	public void setNumGrades(int num){
		numGrades = num;
	}


	private double getSum()
	{
		double sum=0.0;
		for(double i: nums){
			sum+= i;
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum();
		average = average/nums.length;
		return average;
	}


	//toString method
	public String toString(){
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Grade " + i + ": : " + nums[i]);
		}
		return "average :: " + getAverage();
	}


}