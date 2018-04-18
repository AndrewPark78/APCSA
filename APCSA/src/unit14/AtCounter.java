package unit14;
import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if(atMat[r][c] == '@'){
			atCount ++;
			atMat[r][c] = '%';
			if(r+1 <= 9){
				countAts(r+1, c);
			}
			if(r-1 >= 0){
				countAts(r-1, c);
			}
			if(c+1 <= 9){
				countAts(r, c+1);
			}
			if(c-1 >= 0){
				countAts(r, c-1);
			}
		}
		
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]


		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}