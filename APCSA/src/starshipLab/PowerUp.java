package starshipLab;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class PowerUp {
	int x;
	int y;
	private Image image;

	PowerUp(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + "/src/starshipLab/powerup.png"));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("No Powerup img");
		}
	}

	public void setPos(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public void draw(Graphics window) {
		window.drawImage(image, x, y, 50, 50, null);
	}
}
