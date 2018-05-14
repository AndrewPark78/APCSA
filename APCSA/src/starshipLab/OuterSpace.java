package starshipLab;

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
import java.util.ArrayList;
import java.util.Random;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private boolean gameStateAlive = true;
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	private ArrayList<Ammo> alienShots;
	private int points = 0;
	private boolean[] keys;
	private BufferedImage back;
	private Aliens enemy = new Aliens();
	private PowerUp p;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];
		p = new PowerUp((int) Math.floor(Math.random() * 500) + 100, (int) Math.floor(Math.random() * 300) + 100);
		// instantiate other stuff
		ship = new Ship(100, 400, 4);
		alienOne = new Alien(100, 100, 3);
		alienTwo = new Alien(250, 100, 3);
		aliens = new ArrayList<Alien>();
		aliens.add(alienOne);
		aliens.add(alienTwo);
		shots = new ArrayList<Ammo>();
		alienShots = new ArrayList<Ammo>();
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {

		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);

		graphToBack.fillRect(0, 0, 800, 600);
		if (gameStateAlive) {
			graphToBack.setColor(Color.lightGray);
			graphToBack.drawString("Health: " + ship.getHealth(), 25, 275);
			graphToBack.drawString("Killed: " + points, 25, 300);
			graphToBack.drawString("Ammo:", 25, 325);
			graphToBack.setColor(Color.cyan);
			for (int i = 1; i <= 15 - shots.size(); i++) {
				graphToBack.setColor(Color.cyan);
				graphToBack.fillRect(25, 325 + (15 * i), 30, 15);
				graphToBack.setColor(Color.black);
				graphToBack.drawRect(25, 325 + (15 * i), 30, 15);
			}

			p.draw(graphToBack);
			int count = aliens.size();
			int x = (int) Math.floor(Math.random() * 60);
			if (x == 1) {
				if (count == 0) {
					System.out.println("Adding first");
					aliens.add(new Alien(100, 100, 3));
				} else if (count < 3) {

					if (aliens.get(count - 1).getX() + (150 * count) < 650) {
						System.out.println("Adding 1st Row");
						System.out.println(count);
						aliens.add(new Alien(aliens.get(count - 1).getX() + (150 * count), 100, 3));
					}
				} else if (count == 3) {
					System.out.println("Adding 2nd");
					System.out.println(count);
					aliens.add(new Alien(100, 200, 3));
					System.out.println(count);
				} else if (count < 6) {

		graphToBack.fillRect(0,0,800,600);
		
	//	ship.draw(graphToBack);
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move stuff
		if(keys[0] == true){
			ship.move("LEFT");
		}
		if(keys[1] == true){
			ship.move("RIGHT");
		}
		if(keys[2] == true){
			ship.move("UP");
		}
		if(keys[3] == true){
			ship.move("DOWN");
		}
		if(keys[4] == true){
			//ship.;
		}


					if (aliens.get(count - 1).getX() + (150 * count) < 650) {
						System.out.println("Adding 2nd Row");
						System.out.println(count);
						aliens.add(new Alien(aliens.get(count - 1).getX() + (150 * count), 200, 3));
					}
				} else if (count == 6) {
					System.out.println("Adding 3rd");
					aliens.add(new Alien(100, 300, 3));
				} else if (count <= 9) {
					if (aliens.get(count - 1).getX() + (150 * count) < 650) {
						System.out.println("Adding 3rd Row");
						System.out.println(count);
						aliens.add(new Alien(aliens.get(count - 1).getX() + (150 * count), 300, 3));
					}
				}
			}

			if (aliens.size() > 0) {
				for (Alien a : aliens) {
					a.draw(graphToBack);
					a.setX(a.getX() + a.getSpeed());
				}
				for (int i = 0; i < aliens.size(); i++) {
					if (aliens.get(i).getHealth() <= 0) {
						aliens.remove(i);
						points++;
					}
				}
			}
			if (ship.getHealth() <= 0) {
				gameStateAlive = false;
			}

			if (keys[0] == true) {
				if (ship.getX() > 0) {
					ship.move("LEFT");
				}
			}
			if (keys[1] == true) {
				if (ship.getX() < 700) {
					ship.move("RIGHT");
				}
			}
			if (keys[2] == true) {
				if (ship.getY() > 0) {
					ship.move("UP");
				}
			}
			if (keys[3] == true) {
				if (ship.getY() < 500) {
					ship.move("DOWN");
				}
			}
			if (keys[4] == true) {
				if (shots.size() < 15) {
					shots.add(new Ammo(ship.getX() + 45, ship.getY(), 5));
				}
			}
			// add code to move stuff
			if (aliens.size() > 0) {
				for (Alien al : aliens) {
					if (al.getX() < 50) {

						al.setSpeed(al.getSpeed() * -1);
					}
				}
				for (Alien al : aliens) {
					if (al.getX() > 670) {

						al.setSpeed(al.getSpeed() * -1);
					}

				}
			}
			if (shots.size() > 0) {
				for (Ammo a : shots) {
					graphToBack.setColor(Color.cyan);
					a.draw(graphToBack);
					a.move("UP");
				}
				for (int i = 0; i < shots.size(); i++) {
					if (shots.get(i).getY() < -200) {
						shots.remove(i);
					} else if (shots.get(i).getHealth() <= 0) {
						shots.remove(i);
					}
				}
			}
			if (shots.size() > 0 && aliens.size() > 0) {
				for (int i = 0; i < shots.size(); i++) {
					Ammo a = shots.get(i);
					for (int j = 0; j < aliens.size(); j++) {
						Alien al = aliens.get(j);
						if (a.getX() > al.getX() && a.getX() < al.getX() + 100 && a.getY() > al.getY()
								&& a.getY() < al.getY() + 100) {
							a.setHealth(a.getHealth() - 1);
							al.setHealth(al.getHealth() - 1);
						}
					}
				}
			}
			// add in collision detection
			int i = (int) Math.floor(Math.random() * 18);
			if (i == 2) {
				for (Alien a : aliens) {
					int r = (int) Math.floor(Math.random() * 4);
					if (r == 1) {
						alienShots.add(new Ammo(a.getX() + 45, a.getY() + 75, 2));
					}
				}
			}
			if (alienShots.size() > 0) {
				for (Ammo a : alienShots) {
					graphToBack.setColor(Color.green);
					a.draw(graphToBack);
					a.move("DOWN");
				}
				for (int m = 0; m < alienShots.size(); m++) {
					if (alienShots.get(m).getY() > 1000) {
						alienShots.remove(m);
					} else if (alienShots.get(m).getHealth() <= 0) {
						alienShots.remove(m);
					}
				}
			}
			if (alienShots.size() > 0) {
				for (int y = 0; y < alienShots.size(); y++) {
					Ammo a = alienShots.get(y);
					if (a.getX() > ship.getX() && a.getX() < ship.getX() + 75 && a.getY() > ship.getY()
							&& a.getY() < ship.getY() + 100) {
						a.setHealth(a.getHealth() - 1);
						if (ship.getPowered() == true) {
							ship.setPowered(false);
						} else {
							ship.setHealth(ship.getHealth() - 1);
						}
					}
				}
			}
			if (p.x + 50 > ship.getX() + 50 && p.x < ship.getX() + 50 && p.y + 50 > ship.getY()
					&& p.y < ship.getY() + 50) {
				Random r = new Random();
				Random r1 = new Random();
				p.setPos((r.nextInt(41) + 10) * 10, (r1.nextInt(30) + 10) * 10);
				if (ship.getPowered() == false) {
					ship.setPowered(true);
				}
			}
			if (ship.getPowered() == true) {
				ship.setImagePowered();
			}
			if (ship.getPowered() == false) {
				ship.setImageDefault();
			}
			ship.draw(graphToBack);
			twoDGraph.drawImage(back, null, 0, 0);
		} else {
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("Game Over. You killed " + points + " Aliens. ", 300, 50);
			twoDGraph.drawImage(back, null, 0, 0);
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}

		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {
		repaint();
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}
