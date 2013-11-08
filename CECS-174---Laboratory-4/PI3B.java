//Problem 3B
import java.text.*;
import java.util.*;
public class PI 
{
	public static void main(String[] args) 
	{
	double denominator = 1.0;
	double approxPi = 0.0;
	int sign = 1;
	DecimalFormat df;
	df = new DecimalFormat("0.00");
	for(int i=1;i<=1000000;i++)
	{
		approxPi = approxPi + 90.0/(denominator);
		denominator = Math.pow(denominator + 1.0, 4.0);
		sign = sign*-1;
	}//end for loop
	approxPi = Math.pow(approxPi, 0.25);
	System.out.println("Approximation of Pi to 1,000,000 terms is = " + approxPi);
	if(approxPi>Math.PI)
System.out.println("Which is " + df.format((Math.PI/approxPi)*100.0) + "% Accurate.");
	else
System.out.println("Which is " + df.format((approxPi/Math.PI)*100.0)+"% Accurate.");
	}//end class main
}//end class PI
