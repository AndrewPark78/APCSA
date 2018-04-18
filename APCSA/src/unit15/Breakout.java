package unit15;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle rightPaddle;
	private Paddle safeguardRight;

	private Block topWall;
	private Block bottomWall;
	private Block leftWall;
	private Block rightWall;

	private int rightScore;
	private boolean[] keys;
	private BufferedImage back;

	private Block[][] blocks;

	public Breakout() {
		// set up all variables related to the game
		System.out.println("Andrew Park, Period 4, April 4, 08");
		blocks = new Block[4][5];
		ball = new Ball(400, 310, 15, 15, Color.BLACK, 0, 0);

		topWall = new Block(0, 0, 800, 15, Color.black);
		bottomWall = new Block(0, 557, 800, 25, Color.black);
		leftWall = new Block(0, 5, 15, 552, Color.black);
		rightWall = new Block(779, 5, 25, 552, Color.black);

		rightPaddle = new Paddle(750, 275, 20, 80, Color.BLUE);

		safeguardRight = new Paddle(rightWall.getX() - rightPaddle.getWidth() - 5, 275, 12, 90, Color.BLUE);

		rightScore = 0;
		keys = new boolean[6];
		for (int row = 0; row < blocks.length; row++) {
			for (int col = 0; col < blocks[row].length; col++) {
				blocks[row][col] = new Block(35 + (15 * row), 40 + (105 * col), 8, 70);
				// Do stuff
			}
		}
		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and save it as an image
		// that is the exact same width and height as the current screen
		// if (back == null)
		{
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		}

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		graphToBack.setColor(Color.magenta);
		graphToBack.drawString("Score: " + rightScore, 660, 50);
		graphToBack.drawString("Press \'w\' to move up and \'s\' to go down", 280, 530);
		graphToBack.drawString("Press \'r\' to reset the game and \'p\' to start the game", 280, 550);

		rightPaddle.draw(graphToBack);
		bottomWall.draw(graphToBack);
		topWall.draw(graphToBack);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		for (int row = 0; row < blocks.length; row++) {
			for (int col = 0; col < blocks[row].length; col++) {
				blocks[row][col].draw(graphToBack);
				// Do stuff
			}
		}
		// see if ball hits left wall or right wall
		if (ball.didCollideRight(leftWall)) {
			ball.setXSpeed(ball.getXSpeed() * -1);
		}

		if (ball.didCollideLeft(rightWall)) {
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("YOU LOSE", 150, 300);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(400, 310);
			rightScore = 0;

		}

		// prevent the paddles from exiting the screen

		if (rightPaddle.didCollideTop(bottomWall)) {
			rightPaddle.setY(bottomWall.getY() - rightPaddle.getHeight());
			rightPaddle.draw(graphToBack);
		}

		if (rightPaddle.didCollideBottom(topWall)) {
			rightPaddle.setY(topWall.getY() + topWall.getHeight());
			rightPaddle.draw(graphToBack);
		}

		// see if the ball hits the top or bottom wall
		if (ball.didCollideTop(bottomWall) || ball.didCollideBottom(topWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		// see if the ball hits the left paddle

		// see if the ball hits the right paddle
		if (ball.didCollideLeft(rightPaddle) || rightPaddle.didCollideRight(ball)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed((int) (Math.ceil(Math.random() * 2 + 1) * Math.signum((double) ball.getYSpeed())));
		}

		if (ball.didCollideBottom(rightPaddle) || ball.didCollideTop(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}
		for (int row = 0; row < blocks.length; row++) {
			for (int col = 0; col < blocks[row].length; col++) {
				if (ball.didCollideLeft(blocks[row][col])) {
					blocks[row][col].setPos(1000, 1);
					ball.setXSpeed(ball.getXSpeed() * -1);
					rightScore++;
				}
			}
		}
		if (rightScore == 20) {
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("YOU WIN", 150, 300);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(400, 310);
		}
		// see if the paddles need to be moved
		if (keys[0] == true) {
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[1] == true) {
			rightPaddle.moveDownAndDraw(window);
		}
		if (keys[2] == true) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(400, 310);
			rightScore = 0;
			for (int row = 0; row < blocks.length; row++) {
				for (int col = 0; col < blocks[row].length; col++) {
					blocks[row][col] = new Block(35 + (15 * row), 40 + (105 * col), 8, 70);
					// Do stuff
				}
			}
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("YOU LOSE", 150, 300);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("YOU WIN", 150, 300);
		}
		if (keys[3] == true) {
			if (ball.getXSpeed() == 0 && ball.getYSpeed() == 0) {
				ball.setXSpeed(randomXSpeed());
				ball.setYSpeed(randomYSpeed());
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("YOU LOSE", 150, 300);
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("YOU WIN", 150, 300);
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public int randomXSpeed() {
		int randSpeed;
		do {
			randSpeed = (int) Math.ceil(Math.random() * 6) - 3;
		} while (randSpeed < 3 && randSpeed > -3);
		return randSpeed;
	}

	public int randomYSpeed() {
		int randSpeed;
		do {
			randSpeed = (int) Math.ceil(Math.random() * 4) - 2;
		} while (randSpeed == 0);
		return randSpeed;
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'S':
			keys[1] = true;
			break;
		case 'R':
			keys[2] = true;
			break;
		case 'P':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'S':
			keys[1] = false;
			break;
		case 'R':
			keys[2] = false;
			break;
		case 'P':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(7);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
