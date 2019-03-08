import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent implements Updatable
{
	private Ellipse2D.Double ball;
	private int dx = 3, dy = 0;
	
	public Ball(int x, int y)
	{
		ball = new Ellipse2D.Double(0, 0, 10, 10);
		setBounds(x, y, 11, 11);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(ball);
	}
	
	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
}
