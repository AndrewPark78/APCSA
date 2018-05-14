import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Terrain extends GameObject{

	public Terrain(int x, int y, int w, int h) {
		super(x, y, w, h);
		speed = 1;
		colBox = new Rectangle(x , y , width, height);
	}
	public void update(){
		x = x-speed;
		
		if(x+width < -10){
			isAlive = false;
		}
		colBox.setBounds(x , y, width, height);
	}
	public void draw(Graphics g){
		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		
		g.drawImage(GamePanel.terrain, x, y, width, height, null);
//		g.setColor(Color.CYAN);
//		g.drawRect(colBox.x, colBox.y, colBox.width, colBox.height);
	}

}
