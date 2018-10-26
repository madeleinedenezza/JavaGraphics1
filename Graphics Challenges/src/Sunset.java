import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT
	 
public class Sunset extends Canvas
	{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
 		{
        Sunset canvas = new Sunset();
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas).setBackground(Color.white);
        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
 	        frame.setResizable(false);
 	        frame.setVisible(true);
     	}
 	
	public void paint(Graphics graphics) 
 		{
 		graphics.setColor(Color.blue);
 		graphics.fillRect(0, 400, 600, 200);
 		
 		for (int i = 0; i < 600; i++)
			{
     		graphics.setColor(Color.yellow);
     		graphics.fillOval(260 , i, 80, 80);

     		delay();
     		
     		graphics.setColor(Color.white);
     		graphics.fillRect(260, i, 80, 80);
     		
     		graphics.setColor(Color.blue);
     		graphics.fillRect(0, 400, 600, 200);
     		if (i == 400)
     			{
     			delay();
     			graphics.setColor(Color.blue);
     			graphics.fillRect(0, 400, 600, 200);
     			graphics.fillOval(260, i, 80, 80);
     			}
			}
 		
 		for (int blue = 0 ; blue < 255 ; blue++)
 			{
 			for (int magenta= 0 ; magenta < 255 ; magenta++)
 				{
 				for (int red = 0; red < 255 ; red++)
 					{
 	 				for (int black = 0; black < 255 ; black++)
 	 					{
 	 					graphics.setColor(new Color(blue, magenta, black));
 	 				
 	 					delay();
 	 					
 	 	     			graphics.fillRect(0, 0, 600, 400);
 	 					}
 					}
 				}
 			}
 		}
	
	public void delay()
		{
        try
				{
				Thread.sleep(10);
				} catch (InterruptedException e)
				{
				e.printStackTrace();
				}
		}
	}