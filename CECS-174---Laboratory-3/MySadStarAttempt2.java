import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
// Problem 5 Assignment 3
public class MySadStarAttempt2 extends Applet  
{
	Button draw = new Button("Draw");
	DrawOn canvas = new DrawOn();
	Choice color = new Choice(); // more pull down menu
	CheckboxGroup shapes = new CheckboxGroup();// Circle, Square
	Checkbox square = new Checkbox("Square", false, shapes);// Square is not default so put false
	Checkbox circle = new Checkbox("Circle", false, shapes);
	Checkbox triangle = new Checkbox("Triangle", false, shapes);
	Checkbox demoPolygon = new Checkbox("6 Pointed Star", true, shapes);
	// One has to be true to make Checkbox work
	//demoPolygon is default, set to true
	//create a triangle via Polygon
	
	int[] x ={75,150,0};
	int[] y ={0,150,150};
	int n = 3; //# of sides
	Polygon myTriangle = new Polygon(x, y, n);
	int[] x1 ={75,150,0};
	int[] y1 ={0,115,115};
	int[] x2 ={0,75,150};
	int[] y2 ={35,150,35};
	int n1 = 3;
	int n2 = 3;
	// There will be two triangles to form a 6 pointed star! Draw it if you don't believe it.
	Polygon myStar = new Polygon(x1,y1,n1);
	Polygon myStar2 = new Polygon(x2,y2,n2);
	public void init()
	{
	add(draw); 		add(color);
	add(square);	add(circle);
	add(triangle); 	add(demoPolygon);
	add(canvas);
	//assign attributes to canvas before adding canvas	
	color.add("Red");
	color.add("Green");
	color.add("Blue");
	color.select(1);//0 is red, 1 green, 2 is blue,...
	canvas.setSize(150,150);//(150,150) is fine,
	canvas.setBackground(Color.GRAY);
	draw.addActionListener(canvas);
}//end of public void init
	class DrawOn extends Canvas implements ActionListener		
	{
		public void actionPerformed(ActionEvent event)
			{
				repaint();
			}
		public void paint(Graphics g)
		{	Color c= Color.white;
			if(color.getSelectedItem().equals("Red"))
			c = Color.red;
			else if(color.getSelectedItem().equals("Green"))
			c = Color.green;
			else
			c = Color.blue;//end if else statement
			//end if
			g.setColor(c);
			//Get a shape
			if(circle.getState())//True/False
				g.fillOval(20, 20, 100, 100);
			else if (circle.getState())
				g.fillRect(20, 20, 100, 100);
			else if (triangle.getState())
				g.fillPolygon(myTriangle);
			else if (demoPolygon.getState()==true)
				g.fillPolygon(myStar);
				g.fillPolygon(myStar2);
		}	
			//end if
			//end paint
	}//end drawOn
}//end class MySadStarAttempt
//End problem 5 assignment 3, 6 pointed Star yo.
