

import java.awt.Color;
import java.awt.Graphics;

public class EnemyObject extends GameObject {
	int ctr = 0;
	public EnemyObject(int x, int y, int w, int h) {
		super(x, y, w, h);
		speed = 1;
	}
	
	public void draw(Graphics g){
		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		
		g.drawImage(GamePanel.enemy, x, y, width, height, null);
		//g.setColor(Color.CYAN);
		//g.drawRect(colBox.x, colBox.y, colBox.width, colBox.height);
	}
	
	public void update(){
	x-=speed;
	y += speed*10;
		if(isColliding && collisionObject instanceof Terrain){
			GamePanel.updateScore();
			isAlive = false;
		}

		colBox.setBounds(x, y, width+10, height);
	}
}
