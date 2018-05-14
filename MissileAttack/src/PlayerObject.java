
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class PlayerObject extends GameObject {
	private boolean canFire;

	ObjectManager objManager;
	int yVel = 0;
	boolean isFalling = false;

	PlayerObject(int x, int y, int w, int h) {
		super(x, Runner.HEIGHT - 200 - h, w, h);

		speed = 8;
		canFire = true;

		colBox = new Rectangle(x , y , width, height);
	}

	public void draw(Graphics g) {

		g.drawImage(GamePanel.player, x, y, width, height, null);
//		
//g.drawRect(colBox.x, colBox.y, colBox.width, colBox.height);
	}

	public void update() {
		handleInput();
		x = x-1;
//		if (yVel != 0) {
//		 isFalling = true;
//		}
//		if(isFalling){
//			y += yVel;
//			fall();
//		}
		if (x <= 0) {
			isAlive = false;
		} else if (x >= Runner.WIDTH - 50) {
			isAlive = false;
		}

//		if (y <= 0) {
//			y = 0;
//		} else if (y >= Runner.HEIGHT - 72) {
//			y = Runner.HEIGHT - 72;
//		}

		colBox.setBounds(x, y+height-25, width, height);

		if (isColliding && collisionObject instanceof EnemyObject) {
			isAlive = false;
		}
//		if (isColliding && collisionObject instanceof Terrain) {
//			yVel = 0;
//			if (x + width > collisionObject.getX() && x + width < collisionObject.getX() + 10
//					&& y + height > collisionObject.getY() + 5
//					&& y < collisionObject.getY() + collisionObject.getHeight()) {
//				System.out.println("Left Side");
//				x = collisionObject.getX() - width;
//			}
//			if (x < collisionObject.getX() + collisionObject.getWidth()
//					&& x > collisionObject.getX() + collisionObject.getWidth() - 10
//					&& y + height > collisionObject.getY() + 5
//					&& y < collisionObject.getY() + collisionObject.getHeight()) {
//				System.out.println("Right Side");
//				x = collisionObject.getX() + collisionObject.getWidth();
//			}
//			if (y + height > collisionObject.getY() && y + height < collisionObject.getY() + 10
//					&& x + width > collisionObject.getX() && x < collisionObject.getX() + collisionObject.getWidth()) {
//				System.out.println("Top Side");
//				y = collisionObject.getY() - height;
//				yVel = 0;
//			}
//		}
	}

	public void setObjectManager(ObjectManager o) {
		objManager = o;
	}

	private void handleInput() {
//		if (InputManager.up_key) {
//			if (yVel == 0) {
//				yVel = -10;
//			}
//
//			// y -= speed;
//		}
//		if (InputManager.down_key) {
//			// REMOVE THIS FUNCTION WHEN MOVEMENT WORKING
//			y += speed;
//		}
		if (InputManager.left_key) {
			x -= speed;
		}
		if (InputManager.right_key) {
			x += speed;
		}

		// if(InputManager.space_key && canFire){
		// objManager.addObject(new BulletObject(x + (width / 2), y, 6, 15));
		// canFire = false;
		// }

		if (!InputManager.space_key) {
			canFire = true;
		}
	}

//	private void fall() {
//		int ySpeed = 0;
//		int g = 1;
//		int terminalVel = 8;
//		if (ySpeed + g > terminalVel) {
//			ySpeed = terminalVel;
//		} else {
//			ySpeed += g;
//		}
//		yVel += ySpeed;
//	}
}
