import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Frame extends JFrame implements ActionListener
{
	ArrayList<Ball> balls = new ArrayList<Ball>();
	JWalkingMan man = new JWalkingMan();
	
	public Frame()
	{
		this.setBounds(100, 100, 600, 600);
		this.setLayout(null);
		man.setLocation(250, 50);
		this.add(man);
		
		this.addKeyListener(new KeyListener()
		{

			public void keyPressed(KeyEvent e) 
			{	
					if(e.getKeyCode() == e.VK_S)
					{
						man.setDy(10);
					}
				
					if(e.getKeyCode() == e.VK_W)
					{
						man.setDy(-10);
					}
				
					if(e.getKeyCode() == e.VK_D)
					{
						man.setDx(10);
					}
				
					if(e.getKeyCode() == e.VK_A)
					{
						man.setDx(-10);
					}
				
					if(e.getKeyCode() == e.VK_SPACE)
					{
						Ball b = new Ball(man.getX(), man.getY());
						balls.add(b);
						add(b);
					}
			}

			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_S)
				{
					man.setDy(0);
				}
				
				if(e.getKeyCode() == e.VK_W)
				{
					man.setDy(0);
				}
				
				if(e.getKeyCode() == e.VK_D)
				{
					man.setDx(0);
				}
				
				if(e.getKeyCode() == e.VK_A)
				{
					man.setDx(0);
				}
			}

			public void keyTyped(KeyEvent e) 
			{
				
			}
		});
		
		Timer t1 = new Timer(1000/60, this);
		t1.start();
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		man.update();
		this.fixBounds();
		for(Ball b: balls)
			b.update();
		repaint();
	}
	
	public void fixBounds()
	{
		if(man.getX() == 0)
		{
			man.setLocation(0, man.getY());
		}
		else if(man.getX() == this.getX())
		{
			man.setLocation(this.getX(), man.getY());
		}
		else if(man.getY() == 0)
		{
			man.setLocation(man.getX(), 0);
		}
		else if(man.getY() == this.getY())
		{
			man.setLocation(man.getX(), this.getY());
		}
	}
	
	public static void main(String args[])
	{
		new Frame();
	}

}
