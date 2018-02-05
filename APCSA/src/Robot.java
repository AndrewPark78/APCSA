import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
	public Robot() // constructor method - sets up the class
	{
		setSize(800, 600);
		setBackground(Color.WHITE);
		setVisible(true);
	}


	public void paint(Graphics window) {
		window.setColor(Color.BLUE);

		window.drawString("Robot LAB ", 35, 35);

		// call head method
		Robot r = new Robot();
		r.head(window);
		r.upperBody(window);
		// call other methods

	}

	public void head(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillOval(300, 100, 200, 100);
		window.setColor(Color.green);
		window.fillOval(400, 150, 10, 10);
		window.fillOval(425, 150, 10, 10);
		// add more code here

	}

	public void upperBody(Graphics window) {
		window.setColor(Color.BLACK);
		window.fillRect(350, 200, 100, 200);
		window.fillRect(250, 275, 300, 10);
	}

	public void lowerBody(Graphics window) {
		window.setColor(Color.gray);
		window.fillArc(350, 350, 100, 100, 180, 360);
		// add more code here

	}
}