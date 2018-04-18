package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block implements Collidable {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	// add the other Paddle constructors

	public Paddle(int x, int y) {
		super(x, y);
		speed = 3;
	}

	public Paddle(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public Paddle(int x, int y, int w, int h) {
		super(x, y, w, h);
		speed = 3;
	}

	public Paddle(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = 3;
	}

	public Paddle(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		speed = 3;
	}

	public Paddle(int x, int y, int w, int h, Color col, int s) {
		super(x, y, w, h, col);
		speed = s;
	}

	public void moveUpAndDraw(Graphics window) {
		super.draw(window, Color.WHITE);
		setY(getY() - getSpeed());
		super.draw(window);
	}

	public void moveDownAndDraw(Graphics window) {
		super.draw(window, Color.WHITE);
		setY(getY() + getSpeed());
		super.draw(window);
	}

	public boolean didCollideRight(Object obj) {
		Block ball = (Block) obj;

		if (this.getX() >= ball.getX() && this.getX() <= ball.getX() + ball.getWidth() && this.getY() >= ball.getY()
				&& this.getY() <= ball.getY() + ball.getHeight() - this.getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean didCollideLeft(Object obj) {
		Block ball = (Block) obj;

		if (this.getX() >= ball.getX() - this.getWidth()
				&& this.getX() <= ball.getX() + ball.getWidth() - this.getWidth() && this.getY() >= ball.getY()
				&& this.getY() <= ball.getY() + ball.getHeight() - this.getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean didCollideTop(Object obj) {
		Block ball = (Block) obj;

		if (this.getX() >= ball.getX() && this.getX() <= ball.getX() + ball.getWidth() - this.getWidth()
				&& this.getY() <= ball.getY() + ball.getHeight() - this.getHeight()
				&& this.getY() >= ball.getY() - this.getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean didCollideBottom(Object obj) {
		Block ball = (Block) obj;

		if (this.getX() >= ball.getX() && this.getX() <= ball.getX() + ball.getWidth() - this.getWidth()
				&& this.getY() >= ball.getY() && this.getY() <= ball.getY() + ball.getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	// add get methods

	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		String output = super.toString() + speed;
		return output;
	}
}
