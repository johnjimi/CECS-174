import java.text.*;
import javax.swing.*;
public class JavaStringInputViaWindows2 {
   public static void main(String[] args)  {
    JOptionPane myWindow;
    myWindow = new JOptionPane();
    myWindow.setSize(300,200);
    myWindow.setVisible(true);
    String firstName, lastName;
    String fullName;
    String initials;
    firstName = myWindow.showInputDialog("Enter your first name please: ");
    lastName = myWindow.showInputDialog("Enter your last name please: ");
    fullName = firstName + " " + lastName;
    initials = firstName.substring(0,1);
    myWindow.showMessageDialog(null, " Formally your name: " + lastName + ", " + initials + "." );
   }
 }//end class
//problem 15
