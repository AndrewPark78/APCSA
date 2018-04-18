package unit13;

public class Factorials {
public static void main(String[] args) {
	int num = 4;
	int total = 1;
	for (int i = num; i > 0; i--) {
		total = i*total;
	}
	System.out.println(total);
}
}
