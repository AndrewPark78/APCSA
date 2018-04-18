package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 2;
	}

	// add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c);
		xSpeed = xS;
		ySpeed = yS;
	}

	public Ball(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h);
		xSpeed = xS;
		ySpeed = yS;
	}

	// add the set methods
	public void setYSpeed(int s) {
		ySpeed = s;
	}

	public void setXSpeed(int s) {
		xSpeed = s;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		super.draw(window, Color.white);
		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);
		// draw the ball at its new location
		super.draw(window, getColor());
	}

	public boolean equals(Object obj) {

		return false;
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}
	// add a toString() method

	@Override
	public boolean didCollideLeft(Paddle obj) {
		return (getX() <= obj.getX() + obj.getW() + Math.abs(getXSpeed())&& (getY() >= obj.getY() && getY() <= obj.getY() + obj.getH()
				|| getY() + getH() >= obj.getY() && getY() + getH() < obj.getY() + obj.getH()));

	}

	@Override
	public boolean didCollideRight(Paddle obj) {

		return (getX() + getW() >= obj.getX() - Math.abs(getXSpeed()) && (getY() >= obj.getY() && getY() <= obj.getY() + obj.getH()
				|| getY() + getH() >= obj.getY() && getY() + getH() < obj.getY() + obj.getH()));

	}

	@Override
	public boolean didCollideBottom(Object obj) {

		if (getY() > 550) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean didCollideTop(Object obj) {

		return getY() < 0;
	}

	@Override
	public boolean didCollideSideLeft(Paddle obj) {
		return (getX() + getW() >= obj.getX() && getX() <= obj.getX() + obj.getW() && getY() + getH() == obj.getY()
				|| getX() + getW() >= obj.getX() && getX() <= obj.getX() + obj.getW()
						&& getY() == obj.getY() + obj.getH());
	}

	@Override
	public boolean didCollideSideRight(Paddle obj) {
		return (getX() + getW() >= obj.getX() && getX() <= obj.getX() + obj.getW() && getY() + getH() == obj.getY()
				|| getX() + getW() >= obj.getX() && getX() <= obj.getX() + obj.getW()
						&& getY() == obj.getY() + obj.getH());

	}
}