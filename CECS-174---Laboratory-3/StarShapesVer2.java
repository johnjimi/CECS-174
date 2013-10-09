//Not sure, problem 3
import java.text.*;
public class StarShapesVer2 
{
 public static void main(String[]args)
  {
	star(21);System.out.println();
	star(21);System.out.println();
	 for(int i=1;i<=10;i=i+1)
	  {
		 star(5);
		 blank(11);
		 star(5);System.out.println();
	  }
	star(21);System.out.println();
	star(21);System.out.println();
  }//end main
 public static void star(int n)
 {
	 for(int i=1;i<=n;i++)
	 {
	   System.out.println("*");
	 }//end for
 }//end star

public static void blank(int n)
 {
	for(int i=1;i<=n;i++)
	{
	  System.out.print(" ");//a single blank
	}//end for
 }//end star
}//end starShapesVer2
//Problem 3
