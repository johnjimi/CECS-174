import javax.swing.*;
public class WindowOfNumbers2{
public static void main(String[] args){
  JOptionPane myWindow;
  myWindow = new JOptionPane();
  String List="";//Use append on List this time.
  int i;
  for (i=1;i<10;i=i+1){
  List=List+Integer.toString(i)+"\n";
  }//end for loop and Add the tenth number without ","
List=List+Integer.toString(i)+"\n"+"The List was created with       returns.";
myWindow.showMessageDialog(null, "The output is: "+"\n"+List);
 }// main end
 }//end class
