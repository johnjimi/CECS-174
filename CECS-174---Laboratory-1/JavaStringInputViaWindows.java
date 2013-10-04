import java.text.*;
import javax.swing.*;
public class JavaStringInputViaWindows {
  public static void main(String[] args) {
   JOptionPane myWindow;
   myWindow = new JOptionPane();
   myWindow.setSize(300,200);
   myWindow.setVisible(true);
   String firstName, middleName, lastName;
   String fullName;
   String initials;
   firstName = myWindow.showInputDialog("Enter your first name please: ");
   middleName = myWindow.showInputDialog("Enter your middle name please: ");
   lastName = myWindow.showInputDialog("Enter your last name please: ");
   fullName = firstName + " " + middleName + " " + lastName;
   initials = firstName.substring(0,1) +middleName.substring(0,1) +lastName.substring(0,1);
   myWindow.showMessageDialog(null, "Your Full Name is: "+fullName);
   myWindow.showMessageDialog(null, " having the initials: "+initials);
   System.exit(0);
  }
}
