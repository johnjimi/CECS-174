import java.text.*;
import java.util.*;
public class PI 
{
	public static void main(String[] args) 
	{
		double denominator=0.0;
		double denominator1=3.0;
		double denominator2=1.0;
		double approxPi=0.0;
		int sign=1;
		DecimalFormat df;
		df= new DecimalFormat("0.00");
		double power=0.0;
		for(int i=1;i<=1000000;i++)
		{
			denominator=denominator2*Math.pow(denominator1,power);
			approxPi=approxPi+ sign*1/(denominator);
			power=power+1.0;
			denominator2=denominator2+2.0;
			sign=sign*-1;
		}
		approxPi=approxPi*6*Math.sqrt(1.0/3);
System.out.println("Approximation of Pi to 1,000,000 terms is = "+approxPi);
		if (Math.PI>approxPi)
		{
System.out.println("Which is: "+df.format((approxPi/Math.PI)*100.00)+"% Accurate");
		}
		else
		{
System.out.println("Which is: "+df.format((Math.PI/approxPi)*100.00)+"% Accurate");
		}//end else
	}//end public main
}//end PI class
