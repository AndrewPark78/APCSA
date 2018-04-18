package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;
public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		ArrayList<String> gradebook = new ArrayList<String>();
		//Scanner file = new Scanner(new File("gradebook.dat"));
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit11/gradebook.dat"));
			while (file.hasNextLine()) {
				gradebook.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println(e);
		}
//		for (int i = 0; i < gradebook.size(); i++) {
//			System.out.println(gradebook.get(i));
//		}
		String s = gradebook.get(1);
		int numS = Integer.parseInt(s);
		int nameC = 2;
		int gradeC = 3;
		String name = gradebook.get(0);
		Class cl = new Class(name, numS);
		for (int i = 0; i < numS; i++) {
			Student c = new Student(gradebook.get(nameC), gradebook.get(gradeC));
			cl.addStudent(i, c);
			nameC += 2;
			gradeC += 2;
		}
		cl.sort();
		cl.toString();
		








	}		
}