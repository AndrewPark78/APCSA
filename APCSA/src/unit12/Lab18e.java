package unit12;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> words = new ArrayList<String>();
		try {
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + "/src/unit12/lab18e.dat"));
			while (file.hasNextLine()) {
				words.add(file.nextLine());
			}

		} catch (Exception e) {
			out.println("err" + e);
		}

		int size = Integer.parseInt(words.get(0));
		words.remove(0);
		ArrayList<Words> dict = new ArrayList<Words>();
		for(String s: words){
			System.out.println(s);
			Words w = new Words(s);
			dict.add(w);
		}
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size() - 1; j++) {
				if (dict.get(j).compareTo(dict.get(j+1)) == 1) {
					Words temp = dict.get(j + 1);
					dict.set(j + 1, dict.get(j));
					dict.set(j, temp);
				}
			}
		}
		System.out.println();
		System.out.println();
		for(Words w: dict){
			System.out.println(w);
		}










	}
}