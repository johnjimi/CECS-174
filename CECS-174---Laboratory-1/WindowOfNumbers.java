import javax.swing.*;
public class WindowOfNumbers{
public static void main(String[] args){
   JOptionPane myWindow;
   myWindow = new JOptionPane();
   String toBeListed="";
   int i;
   for (i=1;i<10;i=i+1){
    toBeListed=toBeListed+Integer.toString(i)+", ";
   }
toBeListed=toBeListed+Integer.toString(i);
myWindow.showMessageDialog(null,  "The output is: "+"\n"+toBeListed);
System.exit(0);
  }
 }
 // Problem 6
