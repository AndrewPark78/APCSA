package starshipLab;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;
	int health = 3;
	boolean isPowered = false;
	public Ship() {
		this(0, 0, 0);
	}

	public Ship(int x, int y) {
		this(x, y, 0);
	}

	public Ship(int x, int y, int s) {
		super(x, y);
		speed = s;
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + "/src/starshipLab/ship.jpg"));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("NO SHIP IMG");
		}
	}
	public void setImagePowered(){
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + "/src/starshipLab/shipWithSheild.jpg"));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("NO SHIP IMG");
		}
	}
	public void setImageDefault(){
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + "/src/starshipLab/ship.jpg"));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("NO SHIP IMG");
		}
	}
	public void setPowered(boolean b){
		isPowered = b;
	}
	public boolean getPowered(){
		return isPowered;
	}
	public void setHealth(int h) {
		health = h;
	}

	public int getHealth() {
		return health;
	}

	public void setSpeed(int s) {
		// add more code
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}

	public String toString() {
		return super.toString() + getSpeed();
	}
}