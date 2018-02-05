
public class DieSim {
	public static void main(String[] args) {
		DieSim d = new DieSim();
		System.out.println(d.rollDie());
	}

	public int rollDie() {
		return 1 + (int)(Math.random() * ((6 - 1) + 1));
	}
}
