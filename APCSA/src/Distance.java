import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {

	}



	public Distance(int x1, int y1, int x2, int y2) {
		this.xOne = x1;
		this.xTwo = x2;
		this.yOne = y1;
		this.yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		System.out.println(x1 + " x1");
		System.out.println(x2 + " x2");
		System.out.println(y1 + " y1");
		System.out.println(y2 + " y2");
	}

	public void calcDistance() {
		double baseX = xTwo-xOne;
		double baseY = yTwo-yOne;
		double d = Math.sqrt((baseX*baseX) + (baseY*baseY));
		distance = d;

	}

	public void print() {
		System.out.println(distance);

	}
}