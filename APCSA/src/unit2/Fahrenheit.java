package unit2;

public class Fahrenheit {
	private double fahrenheit;

	public static void main(String[] args) {
		
		
		Fahrenheit f = new Fahrenheit();
		f.setFahrenheit(100);
		f.print();
	}
	public static int dog(int x){
		if(x<1)
		return 1;
		else
		return x-dog(x-3);
		}
	public void setFahrenheit(double fahren) {
		fahrenheit = fahren;
	}

	public double getCelsius() {
		double celsius = 0.0;
		celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	public void print() {
		// this is part of the solution
		System.out.println(getCelsius());
	}
}