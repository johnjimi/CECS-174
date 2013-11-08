import java.text.*;
import java.util.*;
public class Fune 
{
	public static void main(String[] args) 
	{
	double e = 0.0;
	for(int n=10;n<=1000000000000;n=n*10)
		{
		e = Math.pow((1.0+1.0/n),n);
		System.out.println("Value of n = " + n + "\t\t" + e);
		}//end for loop
	}//end public main
}//end class Fune
