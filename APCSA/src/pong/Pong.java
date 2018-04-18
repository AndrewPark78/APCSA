package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball = new Ball();
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore = 0;
	private int leftScore = 0;
	private int xSpeed;
	private int ySpeed;
	boolean hasScoredL = false;
	boolean hasScoredR = false;
	public Pong() {
		// set up all variables related to the game
		ball.setAll(400, 300, 25, 25);
		xSpeed = ball.getXSpeed();
		ySpeed = ball.getYSpeed();
		// instantiate a left Paddle
		leftPaddle = new Paddle(25, 300, 25, 75, 2);
		leftPaddle.setColor(Color.blue);

		// instantiate a right Paddle
		rightPaddle = new Paddle(750, 300, 25, 75, 2);
		rightPaddle.setColor(Color.red);

		keys = new boolean[5];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		hasScoredL = false;
		hasScoredR = false;
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		// if (back == null) {
		// back = (BufferedImage) (createImage(getWidth(), getHeight()));
		// }
		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		// Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		// String rightScoreWritten = "";
		// for (int i = 0; i < rightScore; i++) {
		// if(i == rightScore){
		// rightScoreWritten += "|";
		// }else{
		// rightScoreWritten+= " ";
		// }
		// }
		window.setColor(Color.white);
		window.drawString("Right Score: " + (rightScore - 1), 700, 10);
		window.drawString("Left Score: " + (leftScore - 1), 10, 10);
		window.setColor(Color.black);
		window.drawString("Right Score: " + (rightScore), 700, 10);
		window.drawString("Left Score: " + (leftScore), 10, 10);
		// see if ball hits left wall or right wall
		// Left Wall
		if ((ball.getX() <= 0)) {
			rightScore++;
			hasScoredL = true;
			ball.setXSpeed(ball.getXSpeed() * -1);

		}
		// Right Wall
		if (ball.getX() >= 800 - ball.getW()) {
			leftScore++;
			hasScoredR = true;
			ball.setXSpeed(-xSpeed);

		}

		// see if the ball hits the top or bottom wall
		if (ball.didCollideBottom(window)) {
			System.out.println("Bottom");
			ball.setYSpeed(ball.getYSpeed() * -1);
		}
		if (ball.didCollideTop(window)) {
			System.out.println("Top");
			ball.setYSpeed(ball.getYSpeed() * -1);
		}

		// see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle)) {
			System.out.println("Left");
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		// see if the ball hits the right paddle
		if (ball.didCollideRight(rightPaddle)) {
			System.out.println("Right");
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		if (ball.didCollideSideLeft(leftPaddle)) {
			System.out.println("Left Side");
			ball.setYSpeed(ball.getYSpeed() * -1);
		}
		if (ball.didCollideSideRight(rightPaddle)) {
			System.out.println("Right Side");
			ball.setYSpeed(ball.getYSpeed() * -1);
		}
		// see if the paddles need to be moved
//		if (hasScoredL) {
//			if ((ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getH()
//					|| ball.getY() + ball.getH() >= leftPaddle.getY()
//							&& ball.getY() + ball.getH() < leftPaddle.getY() + leftPaddle.getH())) {
//				leftPaddle.setY(0);
//				if ((ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getH()
//						|| ball.getY() + ball.getH() >= leftPaddle.getY()
//								&& ball.getY() + ball.getH() < leftPaddle.getY() + leftPaddle.getH())) {
//					leftPaddle.setY(525);
//				}
//			}
//		}
		if (keys[0] == true) {
			// move left paddle up and draw it on the window
			if (leftPaddle.getY() > 10) {
				leftPaddle.moveUpAndDraw(window);
			}

		}
		if (keys[1] == true) {
			// move left paddle down and draw it on the window
			if (leftPaddle.getY() < 500) {
				leftPaddle.moveDownAndDraw(window);
			}

		}
		if (keys[2] == true) {
			if (rightPaddle.getY() > 10) {
				rightPaddle.moveUpAndDraw(window);
			}
		}
		if (keys[3] == true) {
			if (rightPaddle.getY() < 500) {
				rightPaddle.moveDownAndDraw(window);
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		case ' ':
			keys[4] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		case ' ':
			keys[4] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}