package Lab16d;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.io.File;
import java.util.Scanner;

public class Lab16d
{
	public static void main( String args[] )
	{
		System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String madLibFile = "/src/Lab16d/madlib.dat";
		MadLib mad = new MadLib(madLibFile);
		//mad.getRandomAdjective();
		System.out.println(mad.toString());
		out.println("\n");
	}
}