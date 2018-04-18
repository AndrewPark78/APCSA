package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		color = Color.black;
		xPos = 0;
		yPos = 0;
		width = 10;
		height = 10;
	}

	public Block(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int width, int height, Color color) {
		this.xPos = x;
		this.yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Block(int x, int y, int width, int height) {
		this.xPos = x;
		this.yPos = y;
		this.width = width;
		this.height = height;
		color = Color.black;
	}

	// add the other set methods
	public void setX(int n) {
		xPos = n;
	}

	public void setY(int n) {
		yPos = n;
	}

	public void setW(int n) {
		width = n;
	}

	public void setH(int n) {
		height = n;
	}

	public void setColor(Color col) {
		color = col;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods

		window.setColor(color);

		window.fillRect(getX(), getY(), getW(), getH());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, width, height);

	}

	public boolean equals(Object obj) {

		return false;
	}
	public void setAll(int x, int y, int w, int h){
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		this.xPos = x;
		this.yPos = y;

	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}

	// add the other get methods
	public int getW() {
		return width;
	}

	public int getH() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		String output = "";
		output += "X: " + getX() + ", Y: " + getY() + ", width: " + getW() + ", height: " + getH();
		output += ", color: " + getColor();
		return output;
	}

}