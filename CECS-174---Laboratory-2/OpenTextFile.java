import java.util.*;
import java.io.*;

class OpenTextFile 
 {
 public static void main(String[] args) throws FileNotFoundException,IOException
 { 
	Scanner scanner = new Scanner(new File("namesWithSpaces.txt"));;
  PrintWriter pw=new PrintWriter(new File("newnamesver2.txt"));
  	String firstName, middleName, lastName;
  while (scanner.hasNext())
  {
   String fullName=scanner.nextLine();
   StringTokenizer st = new StringTokenizer(fullName," ");
   firstName = st.nextToken();
   middleName = st.nextToken();
   lastName = st.nextToken();
   System.out.println(lastName+", "+firstName+" "+middleName.substring(0,1)+".");
   pw.println(lastName+", "+firstName+" "+middleName.substring(0,1)+".");
  }
 scanner.close();
 pw.close();
 } 
}
