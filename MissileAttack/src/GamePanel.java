import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;

	Timer timer;
	ObjectManager objManager;
	PlayerObject s;

	public static BufferedImage player;
	// public static BufferedImage bullet;
	public static BufferedImage enemy;
	public static BufferedImage background;
	public static BufferedImage terrain;
//	public static BufferedImage highScore;
	int menuState = 0;
	int instructionState = 1;
	int gameState = 2;
	int endState = 3;
	int currentState = menuState;
	ImageIcon icon = new ImageIcon(GamePanel.class.getResource("/highScore.png"));
	static int score = 0;

	Font titleFont;
	Font optionsFont;

	public GamePanel() {
		try {
			player = ImageIO.read(this.getClass().getResourceAsStream("ball.png"));
			// bullet =
			// ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			enemy = ImageIO.read(this.getClass().getResourceAsStream("Missile.png"));
			background = ImageIO.read(this.getClass().getResourceAsStream("background.png"));
			terrain = ImageIO.read(this.getClass().getResourceAsStream("terrain.png"));
//			highScore = ImageIO.read(this.getClass().getResourceAsStream("highScore.png"));
		} catch (Exception e) {

		}

		objManager = new ObjectManager();

		s = new PlayerObject(300, 200, 50, 50);
		s.setObjectManager(objManager);
		objManager.addObject(s);
		for (int i = 0; i < (Runner.WIDTH + 200) / 57; i++) {
			objManager.addObject(new Terrain(i * 57, Runner.HEIGHT - 200, 57, 57));
		}
		titleFont = new Font("Arial", Font.PLAIN, 48);
		optionsFont = new Font("Arial", Font.PLAIN, 24);

		timer = new Timer(1000 / 60, this);
		timer.start();
	}

	public static void updateScore() {
		score++;
	}

	public void paintComponent(Graphics g) {
		if (currentState == menuState) {
			g.setColor(Color.blue);
			g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
			g.setFont(titleFont);
			g.setColor(Color.YELLOW);
			g.drawString("Sky Fall", 600, 200);
			g.setFont(optionsFont);
			g.drawString("Press ENTER to start", 500, 300);
			g.drawString("Press SPACE for intructions", 500, 400);
		} else if (currentState == gameState) {
			g.drawImage(background, 0, 0, Runner.WIDTH, Runner.HEIGHT, null);
			objManager.draw(g);
		} else if (currentState == endState) {
			g.setColor(Color.red);
			g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
			g.setColor(Color.BLACK);
			g.setFont(titleFont);
			g.drawString("GAME OVER", 500, 300);
			g.setFont(optionsFont);
			g.drawString("You Survived " + score + " Missile Strikes.", 475, 400);
			// g.drawString("Press BACKSPACE to Restart", 90, 500);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentState == menuState) {
			if (InputManager.space_key) {
				JOptionPane.showMessageDialog(null,
						"Use left and right arrow keys to move. \n Try not to die as the missiles pummels the conveyor belt you have the misfortune of finding yourself on. \n WARNING: Trying to escape your fate by running off the screen will result in instant death. Good luck friend :D \n"
								+ "High Score is 886 by user: Nina Mao! Try to beat it!");
			      
	                JOptionPane.showMessageDialog(
	                        null,
	                        "High Score",
	                        "High Score", JOptionPane.INFORMATION_MESSAGE,
	                        icon);
				InputManager.space_key = false;
			} else if (InputManager.enter_key) {
				currentState = gameState;
			}
		} else if (currentState == gameState) {
			objManager.update();
			if (!s.isAlive) {
				currentState = endState;
			}
		} else if (currentState == endState) {

		}

		repaint();
	}

	private void resetGame() {
		score = 0;
		objManager.reset();
		s = new PlayerObject(250, 700, 50, 50);
		s.setObjectManager(objManager);
		objManager.addObject(s);
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			InputManager.up_key = true;
		}
		if (key == KeyEvent.VK_DOWN) {
			InputManager.down_key = true;
		}
		if (key == KeyEvent.VK_LEFT) {
			InputManager.left_key = true;
		}
		if (key == KeyEvent.VK_RIGHT) {
			InputManager.right_key = true;
		}
		if (key == KeyEvent.VK_SPACE) {
			InputManager.space_key = true;
		}
		if (key == KeyEvent.VK_ENTER) {
			InputManager.enter_key = true;
		}

		if (key == KeyEvent.VK_ESCAPE) {
			timer.stop();
			System.exit(0);
		}

		if (currentState == endState && e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			resetGame();
			currentState = menuState;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			InputManager.up_key = false;
		}
		if (key == KeyEvent.VK_DOWN) {
			InputManager.down_key = false;
		}
		if (key == KeyEvent.VK_LEFT) {
			InputManager.left_key = false;
		}
		if (key == KeyEvent.VK_RIGHT) {
			InputManager.right_key = false;
		}
		if (key == KeyEvent.VK_SPACE) {
			InputManager.space_key = false;
		}
		if (key == KeyEvent.VK_ENTER) {
			InputManager.enter_key = false;
		}
	}

//	public void draw(Graphics g) {
//		g.drawImage(GamePanel.highScore, 0, 0, 100, 100, null);
//	}
}
