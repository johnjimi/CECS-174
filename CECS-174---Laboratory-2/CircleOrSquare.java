import javax.swing.*;
import java.text.*;
import java.util.*;
import java.io.*;
public class CircleOrSquare {

 public static void main(String[] args) {
  JOptionPane myWindow;
  myWindow = new JOptionPane();
  String circle_or_square;
  circle_or_square = myWindow.showInputDialog("Enter "+" CIRCLE \n or SQUARE \n to find results: ");
  if (circle_or_square.equals("CIRCLE"))
  {
   final double PI=3.1415;
   double radius, area, circumference, volume;
   String input1;
   input1 = myWindow.showInputDialog("Enter Radius:");
   radius = Double.parseDouble(input1);
   DecimalFormat df;
   df = new DecimalFormat("0.00");
   circumference=2.0*PI*radius;
   area = PI*radius*radius;
   volume =(4.0/3.0)*PI*radius*radius*radius;
   myWindow.showMessageDialog(null, "THE COMPUTATIONS OF A "+circle_or_square+"\n WITH A GIVEN radius: " + df.format(radius) + "\n" + "CIRCUMFERENCE = " + df.format(circumference)+ "\n" + "AREA = " + df.format(area)+ "\n" + "VOLUME = " + df.format(volume));
  }
  else if (circle_or_square.equals("SQUARE"))
  {
  double side, area, surface_area,volume;
  String input2;
  input2 = myWindow.showInputDialog("Enter Side Length: ");
  side = Double.parseDouble(input2);
  myWindow.showMessageDialog(null, "THE COMPUTATIONS OF A "+circle_or_square+ "ARE:");
  }
  else
   myWindow.showMessageDialog(null, "Not a valid shape (check your spelling.) And you must prompt ALL IN CAPS!!");
 System.exit(0); 
 }
}
