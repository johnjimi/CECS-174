import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.Applet;
public class ButtonCanvasPress extends Applet 
{
	public Button print = new Button("Print");
	public Button more = new Button("More");
	public Button clear = new Button("Erase");
	public Draw canvas = new Draw();
	public void init()
	{
		add(print);
		add(more);
		add(clear);
		//Make Button Alive!!!
		print.addActionListener(canvas);
		more.addActionListener(canvas);
		clear.addActionListener(canvas);
		add(canvas);
		canvas.setBackground(Color.YELLOW);
		canvas.setSize(150,150);
	}// end of init

	class Draw extends Canvas implements ActionListener
{	
	Object source;
	public void actionPerformed(ActionEvent event)
	{
		source = event.getSource();
		repaint();
	}
	public void paint(Graphics g)
	{
		if (source == print)
		{
			g.drawString("Hi", 20,20);//print
			g.drawString("You just pressed", 20,40);
			g.drawString("the print buTT0n", 20,60);
		}
		else if (source == more)
		{
			g.drawString("Hi, AGAIN", 20,20);//more
			g.drawString("YOU WANT MOAR?", 20,40);
			g.drawString("Then press more", 20,60);
			g.drawString("Otherwise press Clear", 20,80);
		}
		else if(source==clear)
		{
			repaint();
		}
	}//end paint
}// end Draw
// end buttonvanvaspress
}
