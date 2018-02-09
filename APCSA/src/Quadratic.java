import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{


	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		this.a = quadA;
		this.b = quadB;
		this.c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		double inside1 = (b*b);
		double inside2 = (-1*4*a*c);
		double inside3 = inside1 + inside2;
		double sq = Math.sqrt(inside3);
		double b1 = b*(-1);
		double b2 = b*(-1);
		double r1 = b1+sq;
		double r2 = b2-sq;
		rootOne = r1/(2*a);
		rootTwo = r2/(2*a);


	}

	public void print( )
	{
		System.out.println(rootOne);
		System.out.println(rootTwo);

	}
}