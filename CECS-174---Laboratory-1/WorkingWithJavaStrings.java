import java.text.*;// package text
public class WorkingWithJavaStrings {
 public static void main(String[] args){
  String firstName, middleName, lastName;
  String fullName;
  String initials; //Add the name
  firstName="Alex";
  middleName="Robert";
  lastName="Keaton";
  fullName = firstName+" "+middleName+" "+lastName;
  initials = firstName.substring(0,1) +middleName.substring(0,1)+lastName.substring(0,1);
  System.out.print("The person's full name is: "+fullName);
  System.out.println(" with the initials being: "+initials);
 }// end Main
}// end class WorkingWithJavaStrings
