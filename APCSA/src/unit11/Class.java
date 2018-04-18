package unit11;

import java.util.Arrays;
import java.util.Scanner;

import elevensArrayList.Card;

import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
public class Class {
	private String name;
	private Student[] studentList;

	public Class() {
		name = "";
	}

	public Class(String name, int stuCount) {
		this.name = name;
		this.studentList = new Student[stuCount];

	}

	public Student[] getStudents() {
		return studentList;
	}

	public Student getStudent(String stuName) {
		for (Student s : studentList) {
			if (s.getName().equals(stuName)) {
				return s;
			}
		}
		return null;
	}

	public void setStudent(Student s, int i) {
		studentList[i] = s;
	}

	public void sort() {
		for (int i = 0; i < studentList.length; i++) {
			for (int j = 0; j < studentList.length-1; j++) {
				if (studentList[j].compareTo(studentList[j+1]) == 1) {
					Student temp = studentList[j+1];
					studentList[j+1] = studentList[j];
					studentList[j] = temp;
				}
			}
		}
	}

	public void addStudent(int stuNum, Student s) {
		studentList[stuNum] = s;

	}

	public String getClassName() {
		return name;
	}

	public double getClassAverage() {
		double classAverage = 0.0;

		for (Student o : studentList) {
			classAverage += o.getAverage();
		}
		classAverage = classAverage / studentList.length;

		return classAverage;
	}

	public double getStudentAverage(int stuNum) {
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName) {
		double d = 0.0;
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getName().equals(stuName)) {
				d = studentList[i].getAverage();
			}
		}

		return d;
	}

	public String getStudentName(int stuNum) {
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage() {
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getAverage() > high) {
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage() {
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getAverage() < low) {
				low = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}

		return hName;
	}

	public String getFailureList(double failingGrade) {
		String output = "";
		//Grade g = new Grade();
		for (int i = 0; i < studentList.length; i++) {
			//g.setValue(studentList.get(i).getAverage());
			if (studentList[i].getAverage() < failingGrade) {
				output += studentList[i].getName() + ", ";
			}
		}

		return output;
	}

	public String toString() {
		String output = "" + getClassName() + "\n";
		System.out.println(getClassName());
		for (int i = 0; i < studentList.length; i++) {
			System.out.println(studentList[i].getName() + " grades: " + studentList[i] + " average: "
					+ studentList[i].getAverage());
		}
		System.out.println("Failure List: " + getFailureList(59.5));
		System.out.println("Highest average: " + getStudentWithHighestAverage());
		System.out.println("Lowest average: " + getStudentWithLowestAverage());

		return output;
	}
}