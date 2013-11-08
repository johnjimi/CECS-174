//Problem 5
import java.text.*;//Importing
import java.util.*;
public class Montee2
{
       public static void main(String[] args)
       {
              int tries=0;
              int i=0, rows=10;
              double e= 1.0, sum = 0.0;
              for (int x=1;x<=rows;x++)
              {
                     tries = tries+2;
                     double a = Math.random();
                     double b = Math.random();
                     while (b>a)
                     {
                           a = b;
                           b = Math.random();
                           tries = tries+1;
                     }//end while
System.out.println("Number of tries: "+tries);
                     sum = sum + tries;
                     tries = 0;
              }//end for
System.out.println("Approximating by immediate predecessor method returns e = "+1.0*sum/rows);
       }// public main
}//end class Montee2
