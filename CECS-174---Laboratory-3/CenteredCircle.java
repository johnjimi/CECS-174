import java.awt.*;
import javax.swing.*;
public class CenteredCircle extends JApplet
{
       public void init()
       {
             
       }//end init
              public void paint (Graphics g)
              {
              g.setColor(Color.RED);
              {
                      int h = getSize().height;
                      int w = getSize().width;
                      int CircleCenterHeight = h/2-10;
                      int CircleCenterWidth = w/2-170;
                      int CircleCenterHeight2 = h/2-10;
                      int CircleCenterWidth2 = w/2+150;
                      for(int radius = 20; radius<h; radius = radius+20)
                      {
                             g.drawOval(CircleCenterWidth, CircleCenterHeight, radius, radius);
                             g.drawOval(CircleCenterWidth2,  CircleCenterHeight2, radius, radius);
                             CircleCenterWidth = CircleCenterWidth-10;
                             CircleCenterHeight = CircleCenterHeight-10;
                             CircleCenterWidth2 = CircleCenterWidth2-10;
                             CircleCenterHeight2 = CircleCenterHeight2-10;
                      }//end for loop
              }//end paint
              }
}//end CenteredCircle
