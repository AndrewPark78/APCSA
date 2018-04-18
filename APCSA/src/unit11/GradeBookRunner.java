package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of this class");
		String name = ""; 
		name = keyboard.nextLine();
		System.out.println("How many students are in this class");
		int num = 0;
		num = keyboard.nextInt();
		Class cl = new Class(name, num);
		System.out.println("What is the name of student 1");
		String sN = keyboard.nextLine();
		sN = keyboard.nextLine();
		for (int i = 1; i <= num; i++) {
			if(i != 1){
			System.out.println("What is the name of student "+ i + "");
			sN = keyboard.nextLine();
			}
			//System.out.println(sN);
			System.out.println("Enter Grades with format \"num - g1 g2 g3...\"");
			String sG = keyboard.nextLine();
			Student s = new Student(sN, sG);
			cl.addStudent(i-1, s);
		}
	System.out.println(cl.toString());


















	}		
}