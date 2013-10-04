import java.awt.*;// awt means applet workshop tool
import javax.swing.*;// this package was not used.
import java.awt.event.*;// Draw
import java.applet.Applet;//applet tool
public class Selections extends Applet 
{

	Button draw = new Button("Draw");// only active button
	DrawOn canvas = new DrawOn();
	//Choice = a type, pull down
	Choice color = new Choice();
	CheckboxGroup shapes = new CheckboxGroup();// Circle, Square
	Checkbox square = new Checkbox("Square", false, shapes);// Square is not default so put false
	Checkbox circle = new Checkbox("Circle", true, shapes);// One has to be true to make Checkbox work
	//Circle is default, set to true
	public void init()
	{
	add(draw);
	add(color);
	add(square);
	add(circle);
	add(canvas);
	//assign attributes to canvas before adding canvas	
	color.add("Red");
	color.add("Green");
	color.add("Blue");
	color.select(0);//0 is red, 1 is blue, 2 is green,...
	canvas.setSize(150,200);//(150,150) is fine,
	draw.addActionListener(canvas);
}//end of init
class DrawOn extends Canvas implements ActionListener		
{
	public void actionPerformed(ActionEvent event)
		{
			repaint();
		}
	public void paint(Graphics g)
	{	Color c;
		if(color.getSelectedItem().equals("Red"))
		c = Color.red;
		else if(color.getSelectedItem().equals("Green"))
		c = Color.green;
		else
		c = Color.blue;//end if else statement
		g.setColor(c);
		//shapes
		if(circle.getState()==true)
			g.fillOval(20, 20, 100, 100);
		else
			g.fillRect(20, 20, 100, 100);
		//end if
	}//paint
		
}
		
}

//problem 2 lab 3


