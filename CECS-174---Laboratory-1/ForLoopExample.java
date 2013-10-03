import java.text.*;
public class ForLoopExample {
public static void main(String[] args){
 //Lets print out the first 10 even numbers, starting with 2
  int i;
  for(i=1;i<=10;i++)
   System.out.print(2*i+", ");
  System.out.println();//go to the next line
  //Now lets do the same a different way and then clean up the last ","
  for(i=2;i<20;i=i+2)  {
	  System.out.print(i+", ");
	  }//end of for loop, now print the last number
	  System.out.println(i);
	 }
	}
// Problem 4
