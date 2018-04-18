package unit15;

public class Animal {
	int numLegs;
	boolean full;
	public Animal(int numLegs, boolean full){
		this.numLegs = numLegs;
		this.full = full;
	}
	public void eat(String food) {
		full = true;
	}

	public void removeLeg() {
		numLegs--;
	}
}
