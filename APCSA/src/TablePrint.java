import java.util.ArrayList;

public class TablePrint {
public static void main(String[] args) {
	ArrayList<Double> nums = new ArrayList<Double>();
	nums.add(1.);
	nums.add(1.);
	nums.add(2.);
	nums.add(4.);
	nums.add(8.);
	nums.add(3.);
	nums.add(9.);
	nums.add(27.);
	nums.add(4.);
	nums.add(16.);
	nums.add(64.);
	nums.add(1.5);
	ArrayList<Double> squared = new ArrayList<Double>();
	ArrayList<Double> cubed = new ArrayList<Double>();
	for(Double d: nums){
		squared.add(d*d);
		cubed.add(d*d*d);
	}
	System.out.print("A values -> "+nums);
	System.out.println();
	System.out.print("A^2 values -> "+squared);
	System.out.println();
	System.out.print("A^3 values -> "+cubed);
}
}
