package unit2;
public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		this.xOne = x1;
		this.xTwo = x2;
		this.yOne = y1;
		this.yTwo = y2;


	}
	public static void main(String[] args) {
		Line l = new Line(1,1,10,15);
		System.out.println(l.calculateSlope());
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{





	}

	public double calculateSlope( )
	{
		double rise = yOne - yTwo - 0.0;
		double run = xOne - xTwo - 0.0;
		double slope = rise/run;
		return slope;

	}

	public void print( )
	{



	}
}