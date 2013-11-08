//Problem 1C
import java.awt.*;
import javax.swing.*;
public class NestedPanels 
 {
 public static void main (String[] args)
 {
  JFrame frame = new JFrame ("Nested Panels");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JPanel subPanel1 = new JPanel();//panel 1
  subPanel1.setPreferredSize (new Dimension(150,100));
  subPanel1.setBackground (Color.green);
  JLabel label1 = new JLabel ("One");
  subPanel1.add(label1);
  JPanel subPanel2 = new JPanel();//panel 2
  subPanel2.setPreferredSize (new Dimension(150,100));
  subPanel2.setBackground (Color.red);
  JLabel label2 = new JLabel ("Two");
  subPanel2.add(label2);
  JPanel primary = new JPanel();
  primary.setBackground (Color.blue);
  primary.add(subPanel1);
  primary.add(subPanel2);
  frame.getContentPane().add(primary);
  frame.pack();
  frame.setVisible(true);
 }
}
