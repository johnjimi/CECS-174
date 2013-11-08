import java.text.*;
import java.util.*;
public class Montee 
{
	public static void main(String[] args) 
	{
		int i=0, rows = 10000;
		double e_approx=1.0, sum=0.0;
		int counter = 0;
		for(i=1;i<=rows;i++)
		{
			sum=0.0;
			while(sum<1.0)
			{
				counter++;
				sum=sum+Math.random();
			}//end while loop
		}//end for loop
	e_approx = (float)(counter)/(float)(rows);
	System.out.println("Approximation of e by sums<1 with " + rows + " trials is " + e_approx);
	}//end public main
}//end class Montee
