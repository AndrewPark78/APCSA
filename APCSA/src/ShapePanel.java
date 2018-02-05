import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		Robot h = new Robot();
		h.head(window);
		h.upperBody(window);
		h.lowerBody(window);
//		Shape b = new Shape(250, 250, 200,200, Color.gray);
//		b.draw(window);
//		//instantiate a Shape
//		Shape s = new Shape(300,300, 50, 50, Color.BLUE);
//		//tell your shape to draw
//		s.draw(window);
//		//instantiate a Shape
//		Shape e = new Shape(400,300, 50, 50, Color.BLUE);
//		Shape m = new Shape(350, 400, 100, 10, Color.red);
//		e.draw(window);
//		//tell your shape to draw
//		m.draw(window);
//		
//
//		//instantiate a Shape
//		//tell your shape to draw
	}
}