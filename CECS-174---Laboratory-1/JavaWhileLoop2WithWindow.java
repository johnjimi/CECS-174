import javax.swing.*;
import javax.swing.JFrame;
public class JavaWhileLoop2WithWindow {
 public static void main(String[] args){
  JOptionPane myWindow;
  myWindow = new JOptionPane();
  int count=1;
  int roll=(int) (Math.random()*20);
  String randomNumbers = "  ";
  while(roll!=10){
   roll=(int)(Math.random()*20);
   count=count+1;
   randomNumbers = randomNumbers + "\n" + Integer.toString(roll);
  }
  myWindow.showMessageDialog(null, randomNumbers + " Finally after "+count+" number of rolls"+"\n"+"We got a 10!!");
 }//end main
}// end class JavaWhileLoop2WithWindow
