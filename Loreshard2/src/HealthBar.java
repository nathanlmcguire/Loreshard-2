import java.awt.*;
import javax.swing.*; 

public class HealthBar extends Canvas 	
	{	
	private static final long	serialVersionUID = 1L;     	
	
	public static void createHealthBar()     		
		{	        
		HealthBar canvas = new HealthBar();	        
		JFrame frame = new JFrame();	       
		frame.setSize(700, 200);	       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
		frame.getContentPane().add(canvas);	        
		frame.setVisible(true);
		Intros.delayOneSecond();
		}     
	
	public void paint(Graphics graphics)     		
		{	  		
		graphics.setColor(Color.red);	        
		graphics.drawRect(50, 50, (Hero.playerHitPoints * 20), 50); 
		graphics.fillRect(50, 50, (Hero.playerHitPoints * 20), 50);
		Intros.delayOneSecond();
		}			
	}