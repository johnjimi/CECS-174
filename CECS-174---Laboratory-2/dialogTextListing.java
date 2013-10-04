import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.*;
import java.text.DecimalFormat;
public class dialogTextListing {
 public static void main(String[] args) {
  double total, amount=1740.0, rate=0.055;
  JOptionPane myWindow;
  myWindow = new JOptionPane();
  DecimalFormat myMoney;
  myMoney = new DecimalFormat("0.00");
  JTextArea outputTextArea = new JTextArea();
  outputTextArea.setText("Year\t  Total\n");
  for(int year=1; year<=10; year++)
  {
  total = amount*Math.pow(1.0+rate,year); 
  outputTextArea.append(year+"\t $"+myMoney.format(total)+"\n");
  }
  myWindow.showMessageDialog(null,outputTextArea, "MY RESULTS ARE!!", myWindow.INFORMATION_MESSAGE);
  System.exit(0);
 }
}
