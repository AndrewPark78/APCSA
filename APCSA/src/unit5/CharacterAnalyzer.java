package unit5;
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	String type = "";

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		this.theChar = c;

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		boolean b = false;
		if(getASCII() >= 65 && getASCII()<=90){
			b = true;
			type = "uppercase";
		}
		//System.out.println(b);
		return b;
	}

	public boolean isLower( )
	{
		boolean b = false;
		if(getASCII() >= 97 && getASCII()<=122){
			b = true;
			type = "lowercase";
		}
		//System.out.println(b);
		return b;
	}
	
	public boolean isNumber( )
	{
		boolean b = false;
		if(getASCII() >= 48 && getASCII()<=57){
			b = true;
			type = "number";
		}
		//System.out.println(b);
		return b;
	}	

	public int getASCII( )
	{
		int i = theChar;
		return i;
	}

	public String toString()
	{
		isUpper();
		isLower();
		isNumber();
		return ""+getChar() + " is a " + type + " character. ASCII == " + getASCII() + "\n";	  
	}
}