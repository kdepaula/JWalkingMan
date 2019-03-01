	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.geom.Ellipse2D;
	import java.awt.geom.Rectangle2D;

	import javax.swing.JComponent;
public class JWalkingMan extends JComponent
{


		private Ellipse2D.Double head;
		private Rectangle2D.Double arms;
		private Rectangle2D.Double leftLeg;
		private Rectangle2D.Double rightLeg;
		private Rectangle2D.Double body;
		
		public JWalkingMan()
		{
			
			head = new Ellipse2D.Double(25, 0, 20, 20);
			body = new Rectangle2D.Double(20,20,30,30);
			leftLeg = new Rectangle2D.Double(20, 50, 10, 20);
			rightLeg = new Rectangle2D.Double(40,50,10,20);
			arms = new Rectangle2D.Double(0, 20, 70, 10);
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
	}
