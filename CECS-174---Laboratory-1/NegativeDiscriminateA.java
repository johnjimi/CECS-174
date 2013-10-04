import java.text.*;
import java.util.*;
public class NegativeDiscriminateA {
 public static void main(String args[]) {
  int a=8, b=4, c=1;
  double discriminate,solutionX1,solutionX2;
  discriminate = b*b-4*a*c;
  if (discriminate >= 0.0) {
   System.out.print("There are real solutions");
   solutionX1 = (-1.0*b-Math.sqrt(discriminate))/(2.0*a);
   solutionX2 = (-1.0*b+Math.sqrt(discriminate))/(2.0*a);
   System.out.println("The solution are: ("+solutionX1+","+solutionX2+")");
  }
  else
  {
  System.out.println("There is a NO real solution.");
 }
}}
