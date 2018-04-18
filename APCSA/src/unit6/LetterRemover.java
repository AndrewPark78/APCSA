package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence, lookFor);
	}
	public LetterRemover(String sentence, char lookFor){
		this.sentence = sentence;
		this.lookFor = lookFor;
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		String s = "";
		s += lookFor;
		String f = cleaned.replaceAll(s, "");
		return f;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}