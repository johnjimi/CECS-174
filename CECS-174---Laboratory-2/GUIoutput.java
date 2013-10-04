import java.text.*;
import java.util.Scanner;
import javax.swing.*;
public class GUIoutput 
{
 public static void main(String [] args)
 {
  Scanner scan = new Scanner(System.in);
  JOptionPane myWindow;
  myWindow = new JOptionPane();
  myWindow.setSize(300,200);
  myWindow.setVisible(true);
  String firstName, middleName, lastName;
  String fullName;
  String middleInitial;
  System.out.println("What is your First Name?: ");
  firstName = scan.next();
  System.out.println("What is your Middle Name?: ");
  middleName = scan.next();
  System.out.println("What is your Last Name?: ");
  lastName = scan.next();
  middleInitial=middleName.substring(0,1);
  fullName = lastName+" "+firstName+" "+middleInitial;
  myWindow.showMessageDialog(null, "Your Full Name is: "+fullName);;
 }//end main
}//end Class GUIoutput
