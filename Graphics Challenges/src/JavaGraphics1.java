import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT
	 
public class JavaGraphics1 extends Canvas
	{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int move = 0;

	public static void main(String[] args) 
 		{
        JavaGraphics1 canvas = new JavaGraphics1();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas).setBackground(Color.white);
        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
 	        frame.setResizable(false);
 	        frame.setVisible(true);
     		}
  
     	public void paint(Graphics graphics) 
     		{
//     		graphics.setColor(Color.blue);
//     		graphics.drawLine(0, 0, 500, 400);
//       	 
//     		graphics.setColor(Color.blue);
//      	graphics.drawLine(500, 0, 0, 400);
//     		
//     		graphics.setColor(Color.blue);
//     		graphics.fillRect(0, 0, 800, 400);
// 			
//     		graphics.setColor(Color.red);
//     		graphics.drawRect(0, 0, 250, 250);
//     		
//     		graphics.setColor(Color.blue);
//     		graphics.drawRect(499, 499, 499, 499);
//     		graphics.setColor(Color.yellow);
//     		graphics.fillRect(500, 500, 500, 500);
//     		
//     		graphics.setColor(Color.yellow);
//     		graphics.fillOval(0, 0, 500, 500);
//     		graphics.setColor(Color.black);
//     		graphics.fillRect(130, 100, 75, 75);
//     		graphics.setColor(Color.black);
//     		graphics.fillRect(300, 100, 75, 75);
//     		graphics.setColor(Color.red);
//     		graphics.fillOval(100, 300, 300, 100);
     		
//     		Scanner userInput = new Scanner(System.in);
//     		System.out.println("What would you like the width and length of your square to be?");
//    		int widthLength = userInput.nextInt();    		
//    		System.out.println("What color would you like your square to be: red or blue?");
//    		String color = userInput.nextLine();	
//    			if (color.equals("red"))
//    				{
//    				graphics.setColor(Color.red);
//    				}
//    			else if (color.equals("blue"))
//    				{
//    				graphics.setColor(Color.blue);
//    				}
//    		graphics.fillRect(0, 0, widthLength, widthLength);
     		
//     		Boolean isStillGoing = true;
//     		while (isStillGoing = true)
//     			{
//     			for (int i = 0; i < 380; i++)
//     				{
//             		graphics.setColor(Color.magenta);
//             		graphics.fillRect(i , 0, 20, 20);
//             		
//             		delay();
//             		
//             		graphics.setColor(Color.white);
//             		graphics.fillRect(i, 0, 20, 20);
//     				}
//     			for (int j = 379; j > 20; j--)
//     				{
//             		graphics.setColor(Color.magenta);
//             		graphics.fillRect(j , 0, 20, 20);
//             		
//             		delay();
//             		
//             		graphics.setColor(Color.white);
//             		graphics.fillRect(j, 0, 20, 20);
//     				}
//     			}

     		
     		
//     		for (int i = 0; i < 400; i = i+100)
//     			{
//     			for (int l = 0 ; l < 400; l = l+100)
//     				{
//     				graphics.setColor(Color.magenta);
//         			graphics.fillRect(i, l, 50, 50);
//     				}
//     			}
//     		for (int j = 50; j < 400; j = j+100)
//     			{
//     			for (int m = 50; m < 400; m = m+100)
//     				{
//         			graphics.setColor(Color.magenta);
//         			graphics.fillRect(j, m, 50, 50);
//     				}
//     			}
     		
     		for (int red = 0 ; red < 255 ; red++)
     			{
     			for (int blue = 0 ; blue < 255 ; blue++)
     				{
     				for (int green = 0; green < 255 ; green++)
     					{
     					graphics.setColor(new Color(red, green, blue));
     	     			graphics.fillRect(0, 0, 300, 300);
     					}
     				}
     			}
     			
    			}
//    
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
