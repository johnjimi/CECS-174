//Assignment 4 problem #6 without functions version1
import java.text.DecimalFormat;
import java.util.Arrays.*;//sort,reverse,sets
public class Stats 
{
	public static void main(String[] args) 
	{
		double mean, variance, std;
		int [] score = new int[1000];
		int sum = 0;
		double sum2 = 0.0;
		//fill in the test score
		for(int i =0; i<1000; i++)
			score[i]=60+(int)(Math.random()*40);
		//get the scores sum for average
		for(int i =0; i<1000; i++)
			sum = sum + score[i];
		//get mean
		mean = sum/1000.0;
		//get variance
		for(int i = 0; i<1000;i++)
			sum2 = sum2 +(score[i]-mean)*(score[i]-mean);
			//get variance
			variance = sum2/(1000-1);
		std =Math.sqrt(variance);
		//output with Decia format
		DecimalFormat df1 = new DecimalFormat("0");
		DecimalFormat df =new DecimalFormat("0.0000");
		System.out.println("The mean = "+ df1.format(mean));//no decimal point
		System.out.println("With a variance = "+ df.format(variance));
		System.out.println("And a Standard deviation = "+df.format(std));
	}//end main
}//end class
