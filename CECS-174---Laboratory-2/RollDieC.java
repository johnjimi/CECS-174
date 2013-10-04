import javax.swing.*;
public class RollDieC {
 public static void main(String[] args) { 
  int frequency1= 0, frequency2= 0, frequency3= 0,
   frequency4= 0, frequency5= 0, frequency6= 0,
   face = 0;
  //here is where the method is used
  for(int roll =1; roll <= 480; roll++ )
  {
   face = rollDice();
   switch (face)
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
   }//END SWITCH
  }// end of structure
 JTextArea outputArea = new JTextArea(5,20);
 JScrollPane scroller = new JScrollPane(outputArea);//added scrollbar
 outputArea.setText("FACE\tFREQUENCY" +
   "\n1\t" +  frequency1 + "\n2\t" + frequency2 +
   "\n3\t" +  frequency3 + "\n4\t" + frequency4 +
   "\n5\t" +  frequency5 + "\n6\t" + frequency6);
 JOptionPane.showMessageDialog(null, scroller, "Rolling a Die 480 Times",
  JOptionPane.INFORMATION_MESSAGE);
 System.exit(0);
 }//end main
 public static int rollDice()
 {
  int rolldie;
  rolldie = 1 + (int)(Math.random()*6);
  return rolldie;
 }

}// end Class RollDie
//Problem 3C
