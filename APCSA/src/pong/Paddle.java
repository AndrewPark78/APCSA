package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int speed) {
		super(x, y);
		this.speed = speed;
	}

	public Paddle(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = speed;
	}

	public Paddle(int x, int y, int width, int height, Color c, int speed) {
		super(x, y, width, height, c);
		this.speed = speed;
	}
	// add the other Paddle constructors

	public void setSpeed(int s) {
		speed = s;
	}

	public void moveUpAndDraw(Graphics window) {
		System.out.println("UP");
		super.draw(window, Color.white);
		super.setY((super.getY() - speed));
		System.out.println(getY());
		super.draw(window, getColor());
	}

	public void moveDownAndDraw(Graphics window) {
		System.out.println("down");
		super.draw(window, Color.white);
		super.setY((getY() + speed));
		super.draw(window, getColor());
		//System.out.println(getColor());
	}

	// add get methods
	public int getS() {
		return speed;
	}

	// add a toString() method
}