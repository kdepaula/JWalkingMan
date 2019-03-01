import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame()
	{
		this.setBounds(100, 100, 600, 600);
		this.setLayout(null);
		
		JWalkingMan man = new JWalkingMan();
		man.setLocation(250, 50);
		this.add(man);
		
		this.addKeyListener(new KeyListener()
		{

			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == KeyEvent.VK_S)
				{
					man.setLocation(man.getX(), (man.getY() + 3));
				}
				
				if(e.getKeyCode() == KeyEvent.VK_W)
				{
					man.setLocation(man.getX(), (man.getY() - 3));
				}
				
				if(e.getKeyCode() == KeyEvent.VK_D)
				{
					man.setLocation((man.getX() + 3), man.getY());
				}
				
				if(e.getKeyCode() == KeyEvent.VK_A)
				{
					man.setLocation((man.getX() - 3), man.getY());
				}
				
			}

			public void keyReleased(KeyEvent e) 
			{
				
			}

			public void keyTyped(KeyEvent e) 
			{
				
			}
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		Frame fr = new Frame();
	}

}

