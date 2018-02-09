package unit2;

public class Circle {
	private double radius;
	private double area;

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(10);
		double a = c.calculateArea();
		c.print(a);
	}

	public void setRadius(double rad) {
		radius = rad;
	}

	public double calculateArea() {
		double a = Math.PI * radius * radius;
		return a;
	}

	public void print(double d) {
		System.out.println(d);
	}
}