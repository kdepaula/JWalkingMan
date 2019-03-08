	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.geom.Ellipse2D;
	import java.awt.geom.Rectangle2D;

	import javax.swing.JComponent;
public class JWalkingMan extends JComponent implements Updatable
{

		private int dx = 0, dy = 0;
		private Ellipse2D.Double head;
		private Rectangle2D.Double arms;
		private Rectangle2D.Double leftLeg;
		private Rectangle2D.Double rightLeg;
		private Rectangle2D.Double body;
		
		public JWalkingMan()
		{
			
			head = new Ellipse2D.Double(25, 0, 20, 20);
			body = new Rectangle2D.Double(20,30,30,30);
			leftLeg = new Rectangle2D.Double(20, 60, 10, 20);
			rightLeg = new Rectangle2D.Double(40,60,10,20);
			arms = new Rectangle2D.Double(4, 20, 60, 10);
			this.setSize(100, 100);
		}
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			g2.fill(head);
			g2.fill(arms);
			g2.fill(leftLeg);
			g2.fill(rightLeg);
			g2.fill(body);
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

		public int getDx() 
		{
			return dx;
		}
		
		public int getDy()
		{
			return dy;
		}
		
	
	}
