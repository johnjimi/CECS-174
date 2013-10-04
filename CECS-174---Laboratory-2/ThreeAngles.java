// This one is tricky to do but the code works.
// This can be an example for a Programming Contest question.

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class ThreeAngles {
 public static void main(String[] args) {
  String X1A, Y1A, X2A, Y2A, X3A, Y3A;
  double x1,y1,x2,y2,x3,y3;
  double a,b,c;//distances
  double cosineA,cosineB,cosineC;//cosine onlY
  double A,B,C; //answer
  //START of c0de
  JOptionPane myWindow = new JOptionPane();
  String input1 = myWindow.showInputDialog("Enter Point #1 w/s");
  StringTokenizer st = new StringTokenizer(input1,",");
  X1A= st.nextToken();
  Y1A= st.nextToken();
  x1= Double.parseDouble(X1A);
  y1= Double.parseDouble(Y1A);
  
  String input2 = myWindow.showInputDialog("Enter Point #2 w/s");
  StringTokenizer st2 = new StringTokenizer(input2,",");
  X2A= st2.nextToken();
  Y2A= st2.nextToken();
  x2= Double.parseDouble(X2A);
  y2= Double.parseDouble(Y2A);
  
  String input3 = myWindow.showInputDialog("Enter Point #3 w/s");
  StringTokenizer st3 = new StringTokenizer(input3,",");
  X3A= st3.nextToken();
  Y3A= st3.nextToken();
  x3= Double.parseDouble(X3A);
  y3= Double.parseDouble(Y3A);
  
  a = Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1)); 
  b = Math.sqrt((y3-y2)*(y3-y2)+(x3-x2)*(x3-x2));
  c = Math.sqrt((y3-y1)*(y3-y1)+(x3-x1)*(x3-x1));
  //compute with the law of cosines!
  cosineA = (-a*a + b*b + c*c)/(2.0*b*c);
  cosineB = (-b*b + a*a + c*c)/(2.0*a*c);
  cosineC = (-c*c + a*a + b*b)/(2.0*a*b);
  
  A = Math.acos(cosineA)*180.0/3.14159; //angleA
  B = Math.acos(cosineB)*180.0/3.14159; //angleB
  C = Math.acos(cosineC)*180.0/3.14159; //angleC
  
  //OUTPUT RESULTS.
  String ANS;
  ANS = A + "\n" + B + "\n" + C;
  JOptionPane.showMessageDialog(null, ANS, "ALL VALUES, A, B, C (in degrees)", JOptionPane.INFORMATION_MESSAGE);
 }//end main
}// end class ThreeAngles
