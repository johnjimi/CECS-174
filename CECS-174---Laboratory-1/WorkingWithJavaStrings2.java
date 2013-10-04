import java.text.*;
import java.util.Scanner;
public class WorkingWithJavaStrings2 {
 public static void main(String[] args){
  String firstName, middleName, lastName;
  String fullName;
  String initials;
  //This time ask for the name.
  Scanner cin = new Scanner(System.in);
  System.out.print("Enter your First Name: ");
  firstName = cin.next(); //like cin in C++ , waits for input
  System.out.print("Enter your middle Name: ");
  middleName=cin.next();
  System.out.print("Enter your Last Name: ");
  lastName=cin.next();
  //Now do what the previous program did
  fullName = firstName+" "+middleName+" "+lastName;
  initials = firstName.substring(0,1) +middleName.substring(0,1)+lastName.substring(0,1);
  System.out.print("The person's full name is: "+fullName);
  System.out.println(" with the initials being: "+initials);
 }//end main
}	// end


//Needs to be formatted
