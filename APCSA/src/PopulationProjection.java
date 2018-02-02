
public class PopulationProjection {
public static void main(String[] args) {
	double pop = 312032486;
	for (int i = 1; i < 6; i++) {
		System.out.println("In " + i + " year(s), there will be " + nextyear(pop) + " people.");
		pop = nextyear(pop);
	}
}
public static double nextyear(double pop){
	 double born = 31536000/7.0;
	 double died = 31536000/13.0;
	 double immig = 31536000/45.0;
	 return pop + born + immig - died;
}
}
