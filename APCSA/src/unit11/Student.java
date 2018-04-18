package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private Grades myGrades;
	private String gradeList;
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		this.myName = name;
		this.myGrades = new Grades(gradeList);
		this.gradeList = gradeList;

	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades.setGrades(gradeList);
	
	}
	public String getGrades(){
		return gradeList;
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		int i = myGrades.getNumGrades();
		return i;
	}

	public double getSum()
	{
		double d = myGrades.getSum();
		return d;
	}
	
	public double getAverage()
	{
		double d = getSum()/getNumGrades();
		return d;
	}

	public double getAverageMinusLow()
	{
		double d = 0.0;
		double low = Double.MAX_VALUE;
		for (int i = 0; i < myGrades.getNumGrades(); i++) {
			if(myGrades.getGrades()[i] < low){
				low = myGrades.getGrades()[i];
			}
		}
		double s = getSum() - low;
		double r = getNumGrades()-1;
		d = s/r;
		return d;
	}
	public int compareTo(Student s){
		if(this.getAverage() > s.getAverage()){
			return 1;
		}else if(this.getAverage() == s.getAverage()){
			return 0;
		}else{
			return -1;
		}
	}
	public double getHighGrade()
	{
		double d = myGrades.getHighGrade();
		return d;		
	}
	
	public double getLowGrade()
	{
		double d = myGrades.getLowGrade();
		return d;	
	}
	
	public String toString()
	{
		String s = myGrades.toString();
		return s;
	}	
}