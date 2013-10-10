//Problem 6, Assignment 3
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class GraphingCalc extends Applet
{
		private Button sine = new Button("Sine");
		private Button cosine = new Button("Cosine");
		private Button tangent = new Button("Tangent");
		private Button clear = new Button("Clear");
		private Draw canvas = new Draw();	
	{
		
				add(canvas);
				canvas.setBackground(Color.BLACK);
				canvas.setSize(360,180);
				add(sine);
				add(cosine);
				add(tangent);
				add(clear);
				sine.addActionListener(canvas);
				cosine.addActionListener(canvas);
				tangent.addActionListener(canvas);
				clear.addActionListener(canvas);
			}//end init
	
	public class Draw extends Canvas implements ActionListener
	{
		Object source;//make global to event and paint
			public void actionPerformed(ActionEvent event)
			{
				source = event.getSource();
				repaint();
			}
			public void paint(Graphics g)//use this to write on yellow box and not
			{							 //Entire window i.e. "Draw" overridews "paint()"
			if(source==sine)
				{
				setUpGraph(g);
				drawSineWave(g,0.75,4.0);
				}
		else if (source==cosine)
				{
				setUpGraph(g);
				drawCosineWave(g, 1.5, 4.0);
				}
		else if (source==tangent)
				{
				setUpGraph(g);
				drawTangentWave(g, 1.5, 4.0);//1.5 is the amplitude and 4.0 is the Period
				}
		else if (source==clear)
				{
				setUpGraph(g);
				//drawTangentWave(g, 1.5, 4.0);//1.5 is the amplitude and 4.0 = Period
				}
			}//end paint
			
		public void setUpGraph(Graphics g)
		{
		g.setColor(Color.WHITE);
		g.drawLine(0,90,360,90);
		g.drawLine(180,0,180,180);
		g.drawLine(90,80,90,100);
		g.drawLine(270,80,270,100);
		}//end setUpGraph

		/*public void main (String [] args)
		{
			JOptionPane myWindow;
			myWindow = new JOptionPane();
			String period;
			period = myWindow.showInputDialog("Enter the period");
				
		}*/
		public void init()
		{
			JOptionPane myWindow;
			myWindow = new JOptionPane();
			String value;
			value = myWindow.showInputDialog("Enter the period");
		}
		public void drawSineWave(Graphics g, double amplitude, double period)
		{
		g.setColor(Color.GREEN);
		double amp=amplitude, per=period;//Period and amplitude
		g.drawString(amp+"sin("+per+"(x))", 20, 20);
		for(int x=1;x<360;x++)//making the inequality strict won't erase border
			{
			int y = (int)(amp*(-1*180/4)*Math.sin(per*x*4.0*Math.PI/360));
			g.drawLine(x, 180/2+y, x, 180/2+y);//this will draw a single pixel
			}//end for loop
		}//end sine
		public void drawCosineWave(Graphics g, double amplitude, double period)
		{
		g.setColor(Color.green);
		double amp=amplitude, per=period;
		g.drawString(amp+"cos("+per+"(x))", 20, 20);
		for(int x=1;x<360;x++)//making the inequality strict won't erase border
		{
		int y = (int)(amp*(-1*180/4)*Math.cos(per*x*4.0*Math.PI/360));
		g.drawLine(x, 180/2+y, x, 180/2+y);//this will draw a single pixel
		}//end for
		}//end cosine
		public void drawTangentWave(Graphics g, double amplitude, double period)
		{
		g.setColor(Color.green);
		double amp=amplitude, per=period;
		g.drawString(amp+"tan("+per+"(x))", 20, 20);
		for(int x=1;x<360;x++)//making the inequality strict won't erase border
		{
		int y = (int)(amp*(-1*180/4)*Math.tan(per*x*4.0*Math.PI/360));
		g.drawLine(x, 180/2+y, x, 180/2+y);//this will draw a single pixel
		}//end for 
		}//end tan
	//public void drawConsineWave(Graphics g, double amplitude, double period)
	//Cosine goes here, use sign as a guide
	//Public void drawTangentWave(Graphics g, double amplitude, double period)
	//Tangent goes here use again sin above as a guide.
	}//end Draw
}//end GraphingCalc
