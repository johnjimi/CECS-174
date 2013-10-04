import javax.swing.*;
public class RollDieB {
 public static void main(String[] args) {
  int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0,
   frequency5 = 0, frequency6 = 0, face;
  for( int roll = 1; roll <=3600; roll++ )
  {
   face = 1 + (int)(Math.random()*6); 
   switch ( face )
   {
   case 1:
    ++ frequency1;
    break;
   case 2:
    ++ frequency2;
    break; 
   case 3:
    ++ frequency3;
    break;
   case 4:
    ++ frequency4;
    break;
   case 5:
    ++ frequency5;
    break;
   case 6:
    ++ frequency6;
    break;
   }
  }
 String outputArea = "Face  Frequency" +
  "\n1  " + frequency1 +"\n2  " + frequency2 +
  "\n3  " + frequency3 +"\n4  " + frequency4 +
  "\n5  " + frequency5 +"\n6  " + frequency6;
 JOptionPane.showMessageDialog(null, outputArea,
  "Rolling a Die 3600 Times", JOptionPane.INFORMATION_MESSAGE);
 System.exit(0);
 }
}
//Problem 3B
