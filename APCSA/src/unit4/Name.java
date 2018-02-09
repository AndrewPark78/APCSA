package unit4;
import static java.lang.System.*;

import java.util.ArrayList;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		this.name = s;

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		ArrayList<Character> hold = new ArrayList<Character>();
		for (int i = 0; i < name.length(); i++) {
			hold.add(name.charAt(i));
		}
		int b = 0;
		for (char c: hold) {
			if(c == ' '){
				b = hold.indexOf(c);
			}
		}
		String out = name.substring(0, b);
		return out;
	}

	public String getLast()
	{
		ArrayList<Character> hold = new ArrayList<Character>();
		for (int i = 0; i < name.length(); i++) {
			hold.add(name.charAt(i));
		}
		int b = 0;
		for (char c: hold) {
			if(c == ' '){
				b = hold.indexOf(c);
			}
		}
		String out = name.substring(b, name.length());
		return out;
	}

 	public String toString()
 	{
 		return name;
	}
}