package pixLabs;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hight = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < hight / 2; row++) {
				topPixel = pixels[row][col];
				botPixel = pixels[hight - 1 - row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < height / 2; row++) {
				topPixel = pixels[row][col];
<<<<<<< HEAD
				botPixel = pixels[height - 1 - row][col];
=======
				botPixel = pixels[height-1-row][col];
>>>>>>> branch 'master' of https://github.com/AndrewPark78/APCSA.git
				topPixel.setColor(botPixel.getColor());
			}
		}
	}
<<<<<<< HEAD

	public void mirrorDiagnol() {
		int smaller = Integer.min(getWidth(), getHeight());
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int col = 0; col < smaller; col++) {
			for (int row = 0; row < smaller; row++) {
				topPixel = pixels[row][col];
				botPixel = pixels[col][row];
=======
	
	public void mirrorDiagnol(){
		int smaller = Integer.min(getWidth(), getHeight());
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int col = 0; col < smaller; col++) {
			for (int row = 0; row < smaller; row++) {
				topPixel = pixels[row][col];
				botPixel = pixels[smaller - row][smaller -col];
>>>>>>> branch 'master' of https://github.com/AndrewPark78/APCSA.git
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	public void mirrorSnowman() {
		int mirrorPoint = 206;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 0; row < 300; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 105; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	public void mirrorSeagull() {
		int mirrorPoint = 347;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 230; row < 325; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 233; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copyPart(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		// this.write("collage.jpg");
	}

	public void myCollage() {
		Picture flower1 = new Picture("whiteFLower.jpg");
		// Picture flower2 = new Picture("flower2.jpg");
		this.copyPart(flower1, 190, 164, 317, 304);
		// this.copy(flower2, 317, 0);
		// this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower1);
		flowerNoBlue.zeroBlue();
		this.copyPart(flowerNoBlue, 190, 164, 317, 304);
		this.mirrorVertical();
		// this.write("collage.jpg");

	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel top = null;
		Pixel bot = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color botColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
				top = pixels[row][col];
<<<<<<< HEAD
				bot = pixels[row + 1][col];
=======
				bot = pixels[row+1][col];
>>>>>>> branch 'master' of https://github.com/AndrewPark78/APCSA.git
				botColor = bot.getColor();
				if (top.colorDistance(botColor) > edgeDist)
					top.setColor(Color.BLACK);
				else
					top.setColor(Color.WHITE);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
	}

	public void grayScale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed((int) Math.floor(pixelObj.getAverage()));
				pixelObj.setBlue((int) Math.floor(pixelObj.getAverage()));
				pixelObj.setGreen((int) Math.floor(pixelObj.getAverage()));
			}
		}
	}

	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		int r = 0;
		int g = 0;
		int b = 0;
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				g = pixelObj.getGreen();
				b = pixelObj.getBlue();
				pixelObj.setBlue(b - 100);
				pixelObj.setGreen(g - 100);
			}
		}
	}

	public void blur() {
		Pixel pixel = null;
		Pixel curPixel = null;
		int redValue = 0;
		int greenValue = 0;
		int blueValue = 0;
		int count = 0;

		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {

				pixel = this.getPixel(x, y);

				count = 0;
				redValue = 0;
				greenValue = 0;
				blueValue = 0;

				for (int xChange = x - 1; xChange <= x + 1; xChange++) {
					for (int yChange = y - 1; yChange <= y + 1; yChange++) {

						if (xChange >= 0 && xChange < this.getWidth() && yChange >= 0 && yChange < this.getHeight()) {
							curPixel = this.getPixel(xChange, yChange);
							redValue = redValue + curPixel.getRed();
							greenValue = greenValue + curPixel.getGreen();
							blueValue = blueValue + curPixel.getBlue();
							count = count + 1;
						}
					}
				}
				Color newColor = new Color(redValue / count, greenValue / count, blueValue / count);
				pixel.setColor(newColor);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("blueMotorcycle.jpg");
		beach.explore();
<<<<<<< HEAD
		// System.out.println("One");
			beach.blur();
			beach.blur();
			beach.blur();
=======
		beach.edgeDetection(2);
>>>>>>> branch 'master' of https://github.com/AndrewPark78/APCSA.git
		beach.explore();
		System.out.println("complete");
		// for (int i = 0; i < 100; i++) {
		// beach.blur();
		// }
		//
		// beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this