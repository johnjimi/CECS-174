//problem 3
// you might have to adjust numbers to get a shape.
import java.text.*;
public class StarShapesVer2A 
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
	   System.out.print("*");
	 }//end for
 }//end star
