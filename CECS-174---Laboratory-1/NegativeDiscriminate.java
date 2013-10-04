import java.text.*;//for println
public class NegativeDiscriminate{
 public static void main(String args[]){
  int a=4, b=4, c=1;
  double discriminate, solutionX1, solutionX2;
  discriminate = b*b-4*a*c;
  solutionX1 = (-1.0*b-Math.sqrt(discriminate))/(2.0*a);
  solutionX2 = (-1.0*b+Math.sqrt(discriminate))/(2.0*a);
  System.out.println("The solution are: ("+solutionX1+","+solutionX2+")");
 }
}
//Problem 16
