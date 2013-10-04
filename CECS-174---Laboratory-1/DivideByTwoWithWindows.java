import javax.swing.*;
import java.text.DecimalFormat;
public class DivideByTwoWithWindows {
 public static void main(String[] args){
  DecimalFormat dc = new DecimalFormat("##000.00000");
  String num,divisions;//note !!
  double number;
  int numberOfDivisions,i;
  JOptionPane myWindow = new JOptionPane();
  num=myWindow.showInputDialog("Enter the number to divide by 2:");
  number=Integer.parseInt(num);
  divisions=myWindow.showInputDialog("How many divisions do you want to perform?");
  numberOfDivisions=Integer.parseInt(divisions);
  JTextArea outputInPane = new JTextArea(10,20);
  outputInPane.setText("Divsion"+"\t"+"Result\n");
  for(i=0;i<=numberOfDivisions;i++){
   outputInPane.append("Division #"+i+"\t"+dc.format(number)+"\n");
   number=number/2.0;
  }
  JScrollPane scroller = new JScrollPane(outputInPane);
  JOptionPane.showMessageDialog(null, scroller,"Scroll bar of Divisions", JOptionPane. INFORMATION_MESSAGE);
  System.exit(0);
 }
}
//problem 25
