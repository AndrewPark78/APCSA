package unit4;
import static java.lang.System.*;

import java.util.ArrayList;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		this.word = s;

	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		boolean b = false;
		ArrayList<Character> hold = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			hold.add(word.charAt(i));
		}
		for(char h: hold){
			if(h == c);
			b = true;
		}
		return b;
	}

	public boolean findSubString(String s)
	{
		boolean b = false;
		ArrayList<Character> hold = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			hold.add(word.charAt(i));
		}
		if(word.contains(s)){
			b = true;
		}
		return b;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}