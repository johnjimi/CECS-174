//Getting input with ActionListener and Using Canvas to Paint
//Use Canvas instead of the default "this" frame panel
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class ButtonCanvasPress extends Applet //Applet not JApplet 
{
 private Button square = new Button("Square");
 private Button circle = new Button("Circle");
 private Button clear = new Button("Erase");
 private Draw canvas = new Draw();
 public void init()
 {
  add(square);
  add(circle);
  add(clear);
  square.addActionListener(canvas);
  circle.addActionListener(canvas);
  clear.addActionListener(canvas);
  add(canvas);
  canvas.setBackground(Color.YELLOW);
  canvas.setSize(150,150);
 }//end init
class Draw extends Canvas implements ActionListener
{
 Object source;//make global to event and paint
 public void actionPerformed(ActionEvent event)
 {
  source = event.getSource();
  repaint();
 }
 public void paint(Graphics g) //use this to write on yellow box,
 {      //not the Entire Window
   if (source==square)
   {
    g.drawLine(55, 44, 95, 44);
    g.drawLine(55, 44, 55, 84);
    g.drawLine(55, 84, 95, 84);
    g.drawLine(95, 44, 95, 84);
   }
   else if (source==circle)
   {
    g.drawOval(53, 42, 45, 45);
   }
   else if (source==clear)
   {
    repaint();
   }
  }//end paint
 }//end Draw
}//end Bu
