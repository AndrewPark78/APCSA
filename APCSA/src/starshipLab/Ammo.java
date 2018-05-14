package starshipLab;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {
	private int speed;
	int health = 1;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		super(x, y);
	}

	public Ammo(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void setHealth(int h) {
		health = h;
	}

	public int getHealth() {
		return health;
	}

	public void draw(Graphics window) {
		
		window.fillRect(getX(), getY(), 10, 10);
	}

	public String toString() {
		return super.toString();
	}
}