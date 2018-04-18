package unit15;

public class Dog extends Animal {
	public Dog(int numLegs, boolean full) {
		super(numLegs, full);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dog d = new Dog(4, false);
		d.removeLeg();
		d.eat("Steak");
		System.out.println("Legs: " + d.numLegs);
		System.out.println("Dog is full! " + d.full);
	}
}
